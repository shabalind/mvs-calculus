  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f19(_ v0: Double) -> Double {
    var v7: Double = v0
    var v1: Double = v7
    var v5: Double = v1
    var v6: Double = v0
    var v2: Double = v5
    var v4: Double = v1
    var v10: Double = v1
    var v3: Double = v6
    let v12: Double = v1 / v5
    v5 = v10
    var v8: Double = v12
    var v27: Double = v8
    var v29: Double = v3
    var v23: Double = v8
    let v31: [Double] = [v27, v1, v4, v29, v1]
    var v36: [Double] = v31
    let v40: Double = v31[0]
    v36[4] = v40
    v36[1] = v1
    let v41: Double = v36[4]
    let v63: Double = v41 + v2
    v36[0] = v23
    return v63
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v5: Double = f19(v1)
    let v7: Double = f19(v5)
    var v4: Double = v1
    let v9: Double = f19(v1)
    let v24: Double = f19(v7)
    let v47: Double = v24 + v9
    let v83: Double = v4 * v47
    return v83
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))], [s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))], [s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))]]
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
