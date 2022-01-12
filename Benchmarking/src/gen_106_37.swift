  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s7 {
    var p0: [s1]
  }
  func f5(_ v0: Double) -> Double {
    var v4: Double = v0
    var v1: Double = v4
    let v7: Double = v4 + v0
    var v3: Double = v4
    v4 = v3
    var v2: Double = v1
    var v6: Double = v3
    v2 = v0
    var v11: Double = v2
    v3 = v4
    var v5: Double = v2
    var v13: Double = v11
    var v17: Double = v3
    var v15: Double = v6
    var v18: Double = v11
    var v30: Double = v17
    v17 = v30
    var v51: Double = v15
    var v21: Double = v13
    var v33: Double = v15
    var v40: Double = v15
    var v42: Double = v15
    var v59: Double = v21
    var v108: Double = v5
    let v39: [Double] = [v7, v42, v51, v59, v17, v18, v33]
    v15 = v11
    var v92: [Double] = v39
    v92[5] = v40
    v92[3] = v0
    v92[3] = v108
    let v63: Double = v92[6]
    v92[6] = v108
    return v63
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: Double) -> Double {
    let v7: Double = f5(v1)
    let v8: [Double] = [v7, v1, v7, v7, v1]
    let v24: Double = f5(v7)
    let v22: Double = v8[3]
    let v30: Double = f5(v22)
    var v190: Double = v24
    var v96: Double = v190
    let v55: Double = v30 - v96
    return v55
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]])), s1(p0: s0(p0: [[4.0]], p1: [[5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0]]))]), s7(p0: [s1(p0: s0(p0: [[8.0]], p1: [[9.0]]), p1: s0(p0: [[10.0]], p1: [[11.0]])), s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: s0(p0: [[14.0]], p1: [[15.0]]))]), s7(p0: [s1(p0: s0(p0: [[16.0]], p1: [[17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0]])), s1(p0: s0(p0: [[20.0]], p1: [[21.0]]), p1: s0(p0: [[22.0]], p1: [[23.0]]))])]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
