  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [Double]
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [[s1]]
    var p1: [s2]
  }
  func f28(_ v0: Double) -> Double {
    var v7: Double = v0
    var v1: Double = v7
    var v4: Double = v7
    var v6: Double = v4
    var v8: Double = v0
    var v5: Double = v1
    v7 = v1
    var v20: Double = v5
    var v12: Double = v6
    var v9: Double = v20
    var v11: Double = v20
    var v21: Double = v0
    v6 = v21
    v21 = v11
    let v29: [Double] = [v8]
    let v18: [Double] = [v4, v1]
    let v26: Double = v29[0]
    var v19: [Double] = v18
    let v28: Double = v19[0]
    var v24: [Double] = v29
    let v25: Double = v24[0]
    var v27: Double = v5
    let v34: Double = v29[0]
    v19[1] = v26
    let v44: [Double] = [v27, v11, v25, v9, v26, v0]
    var v46: [Double] = v44
    v21 = v28
    let v30: Double = v46[0]
    let v77: Double = v18[0]
    let v59: Double = v44[4]
    v46[4] = v27
    var v150: [Double] = v44
    let v32: Double = v19[1]
    v19[1] = v77
    v19[1] = v12
    v150[2] = v34
    v150[4] = v32
    let v57: Double = v150[1]
    v46[2] = v8
    v9 = v59
    v6 = v30
    v150 = v46
    return v57
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v2: Double = f28(v1)
    let v8: Double = f28(v1)
    let v16: Double = f28(v1)
    let v19: Double = f28(v2)
    let v28: Double = f28(v16)
    let v27: [Double] = [v19, v2, v8, v19, v28]
    let v26: Double = v27[4]
    let v72: Double = f28(v26)
    return v72
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p2: [8.0, 9.0, 10.0])], [s1(p0: s0(p0: [[11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0], [18.0]]), p2: [19.0, 20.0, 21.0])]], p1: [s2(p0: s1(p0: s0(p0: [[22.0]], p1: [[23.0], [24.0], [25.0]]), p1: s0(p0: [[26.0]], p1: [[27.0], [28.0], [29.0]]), p2: [30.0, 31.0, 32.0]), p1: s0(p0: [[33.0]], p1: [[34.0], [35.0], [36.0]])), s2(p0: s1(p0: s0(p0: [[37.0]], p1: [[38.0], [39.0], [40.0]]), p1: s0(p0: [[41.0]], p1: [[42.0], [43.0], [44.0]]), p2: [45.0, 46.0, 47.0]), p1: s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])), s2(p0: s1(p0: s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), p1: s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), p2: [60.0, 61.0, 62.0]), p1: s0(p0: [[63.0]], p1: [[64.0], [65.0], [66.0]]))])]
    let v1: Double = 67.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 67.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
