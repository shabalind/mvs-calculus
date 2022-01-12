  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
    var p6: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f18(_ v0: Double) -> Double {
    var v1: Double = v0
    var v6: Double = v0
    var v5: Double = v6
    var v2: Double = v6
    var v7: Double = v0
    v5 = v2
    var v4: Double = v1
    let v13: [Double] = [v1, v6, v0]
    let v14: Double = v13[1]
    let v8: Double = v13[1]
    let v17: Double = v13[1]
    var v10: [Double] = v13
    v10[1] = v0
    v10[1] = v4
    let v32: Double = v13[1]
    var v19: [Double] = v13
    v10[0] = v0
    var v45: Double = v14
    var v15: [Double] = v10
    let v46: Double = v10[1]
    var v22: Double = v32
    v10[0] = v17
    let v29: Double = v15[2]
    v19[1] = v46
    let v30: Double = v13[1]
    v10[1] = v8
    let v41: [Double] = [v29, v30, v45, v22, v7, v5]
    var v43: [Double] = v41
    let v25: Double = v43[5]
    let v31: Double = v41[3]
    let v33: Double = v19[2]
    v43[2] = v25
    v43[2] = v33
    let v39: Double = v43[3]
    var v27: Double = v5
    v43[5] = v27
    let v56: Double = v25 + v39
    v15[2] = v31
    v19[1] = v2
    v2 = v6
    return v56
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v4: Double = f18(v1)
    let v6: Double = f18(v4)
    let v30: Double = v6 * v6
    var v66: Double = v6
    var v19: Double = v66
    v19 = v30
    return v19
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0], [6.0]], p3: [[7.0], [8.0], [9.0]], p4: [[10.0]], p5: [[11.0]], p6: [[12.0], [13.0]]), p1: s0(p0: [[14.0], [15.0]], p1: [[16.0], [17.0]], p2: [[18.0], [19.0], [20.0]], p3: [[21.0], [22.0], [23.0]], p4: [[24.0]], p5: [[25.0]], p6: [[26.0], [27.0]]))]
    let v1: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
