  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: s1
  }
  struct s4 {
    var p0: [s2]
    var p1: s2
  }
  func f28(_ v0: Double) -> Double {
    var v1: Double = v0
    var v2: Double = v1
    v2 = v0
    var v5: Double = v1
    var v7: Double = v1
    var v6: Double = v7
    v6 = v0
    var v4: Double = v2
    var v10: Double = v5
    var v14: Double = v4
    var v3: Double = v14
    var v8: Double = v6
    let v11: Double = v5 / v6
    var v15: Double = v4
    var v24: Double = v11
    var v13: Double = v0
    var v21: Double = v5
    var v31: Double = v0
    let v35: [Double] = [v3, v21, v8, v15]
    let v27: Double = v35[0]
    var v62: Double = v3
    v24 = v13
    let v29: Double = v35[3]
    let v46: Double = v35[1]
    let v30: Double = v31 + v62
    var v52: [Double] = v35
    var v33: [Double] = v52
    v52[2] = v21
    var v75: [Double] = v33
    v33[2] = v15
    v33[1] = v29
    v75[2] = v31
    let v42: Double = v30 / v27
    var v47: [Double] = v35
    v52[1] = v29
    var v28: [Double] = v33
    let v71: [[Double]] = [v28, v35, v33, v75, v47, v52, v75]
    v47 = v52
    let v109: [Double] = v71[1]
    let v32: Double = v109[0]
    v33[3] = v10
    v52[3] = v24
    v33[0] = v46
    v24 = v42
    return v32
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: s3, _ v2: s3, _ v3: Double) -> Double {
    let v5: Double = f28(v3)
    let v7: Double = f28(v5)
    let v28: Double = v7 - v7
    return v28
  }
  func benchmark() {
    let v0: s4 = s4(p0: [s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))], p1: s2(p0: s1(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])), p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])))
    let v1: s3 = s3(p0: s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p1: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])))
    let v2: s3 = s3(p0: s1(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])))
    let v3: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
