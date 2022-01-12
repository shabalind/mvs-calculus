  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f111(_ v0: Double) -> Double {
    var v2: Double = v0
    var v3: Double = v2
    let v6: Double = v0 - v3
    var v5: Double = v6
    return v5
  }
  func f102(_ v0: Double) -> Double {
    let v4: Double = f111(v0)
    var v7: Double = v4
    var v2: Double = v4
    var v8: Double = v2
    let v6: Double = f111(v7)
    let v1: Double = f111(v6)
    let v12: Double = f111(v1)
    var v15: Double = v8
    let v3: Double = f111(v12)
    v7 = v12
    let v5: Double = f111(v7)
    var v10: Double = v6
    let v13: Double = f111(v4)
    let v19: Double = f111(v7)
    let v24: Double = f111(v19)
    var v18: Double = v4
    var v39: Double = v18
    let v11: Double = f111(v39)
    var v34: Double = v5
    var v30: Double = v19
    let v40: Double = f111(v30)
    var v44: Double = v13
    var v28: Double = v24
    let v35: [Double] = [v11, v40, v44, v39, v10]
    let v38: [Double] = [v34, v13, v2, v44, v15, v10]
    let v46: Double = f111(v3)
    var v31: [Double] = v35
    let v47: [[Double]] = [v31, v31, v35]
    let v80: [Double] = v47[0]
    let v67: Double = v38[3]
    v31[3] = v6
    v31[4] = v46
    let v91: Double = v80[2]
    v31[0] = v67
    v31[1] = v30
    v31[1] = v28
    return v91
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v4: [s1] = v0[0]
    let v3: s1 = v4[0]
    let v6: s0 = v3.p0
    let v14: [[Double]] = v6.p1
    let v29: [Double] = v14[1]
    let v34: Double = v29[0]
    let v62: Double = f102(v34)
    return v62
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])])], [s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]])])]]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
