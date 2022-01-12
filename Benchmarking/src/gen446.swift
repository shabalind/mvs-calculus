  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  func f65(_ v0: Double) -> Double {
    var v1: Double = v0
    var v8: Double = v0
    var v7: Double = v1
    var v3: Double = v7
    v7 = v0
    var v5: Double = v0
    var v6: Double = v3
    var v16: Double = v7
    let v17: [Double] = [v16, v0, v16, v7, v16, v7, v6]
    v16 = v8
    let v21: Double = v17[3]
    v1 = v21
    v1 = v3
    let v14: Double = v17[4]
    var v9: [Double] = v17
    let v13: [[Double]] = [v17, v17, v9, v9]
    let v30: [Double] = v13[1]
    v9[6] = v6
    var v25: [[Double]] = v13
    v25 = v13
    let v23: [Double] = v25[2]
    var v31: [[Double]] = v13
    var v18: [[Double]] = v31
    let v24: [Double] = v18[0]
    v9[2] = v5
    v31[1] = v23
    v25[0] = v9
    v31[1] = v30
    let v19: Double = v23[2]
    let v47: [Double] = v18[1]
    v25[1] = v47
    v31[0] = v30
    var v55: [Double] = v24
    v25[1] = v55
    let v58: Double = v14 / v19
    return v58
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s2], _ v2: Double) -> Double {
    let v13: Double = f65(v2)
    var v37: Double = v13
    var v42: Double = v37
    return v42
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p2: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])
    let v1: [s2] = [s2(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p2: [s0(p0: [[21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]])]))]
    let v2: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
