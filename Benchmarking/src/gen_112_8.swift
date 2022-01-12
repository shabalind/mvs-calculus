  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s7 {
    var p0: s1
    var p1: [s0]
  }
  func f28(_ v0: Double) -> Double {
    let v2: Double = v0 / v0
    var v3: Double = v0
    var v7: Double = v0
    var v8: Double = v3
    var v6: Double = v0
    var v13: Double = v2
    var v5: Double = v8
    var v1: Double = v13
    let v11: Double = v6 - v7
    var v19: Double = v1
    var v10: Double = v5
    var v4: Double = v3
    var v9: Double = v4
    var v17: Double = v19
    var v21: Double = v9
    var v14: Double = v4
    var v29: Double = v0
    var v18: Double = v10
    var v30: Double = v13
    v14 = v10
    var v41: Double = v29
    let v23: Double = v1 - v21
    var v27: Double = v14
    let v48: [Double] = [v14, v18, v30, v10, v6, v11]
    var v56: Double = v23
    let v46: [Double] = [v41, v3]
    let v40: Double = v48[2]
    var v57: [Double] = v48
    v57[2] = v17
    var v55: [Double] = v57
    v55[3] = v19
    let v72: Double = v40 - v7
    v55 = v48
    let v32: Double = v46[0]
    let v26: Double = v55[3]
    v55[2] = v27
    let v122: Double = v56 + v6
    v57[5] = v32
    let v141: Double = v72 / v26
    v14 = v122
    v8 = v3
    return v141
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v4: Double = f28(v1)
    let v3: Double = f28(v1)
    let v11: Double = v4 + v3
    let v30: Double = v11 + v4
    return v30
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]), p1: [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])])]
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
