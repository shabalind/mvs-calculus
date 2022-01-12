  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s4 {
    var p0: [[s1]]
    var p1: [s1]
  }
  func f70(_ v0: Double) -> Double {
    let v6: [Double] = [v0, v0]
    var v1: [Double] = v6
    let v3: Double = v6[1]
    let v5: Double = v6[1]
    let v9: Double = v6[1]
    let v10: Double = v0 - v3
    let v2: [[Double]] = [v1, v6, v1, v1]
    v1[0] = v0
    var v12: Double = v5
    var v31: Double = v0
    var v19: [[Double]] = v2
    var v21: [Double] = v1
    var v13: [Double] = v1
    v19[2] = v13
    let v17: [Double] = v2[0]
    v1[1] = v10
    let v15: [Double] = v2[3]
    v21 = v15
    let v16: [Double] = v19[2]
    v13[0] = v12
    var v38: Double = v0
    v1[1] = v9
    let v43: [Double] = v19[2]
    var v20: [[Double]] = v2
    var v40: [[Double]] = v19
    v19[2] = v13
    let v22: [Double] = v20[1]
    let v57: Double = v43[0]
    var v25: [Double] = v16
    let v32: Double = v25[0]
    var v85: [[Double]] = v40
    var v26: [[Double]] = v85
    v13 = v17
    let v61: [Double] = [v3, v57, v31, v32, v10, v38]
    v25 = v21
    var v70: [Double] = v61
    var v82: [Double] = v25
    v85[2] = v82
    v85 = v26
    let v67: Double = v70[3]
    var v100: [[Double]] = v85
    v19[0] = v22
    v19 = v100
    return v67
  }
  func f67(_ v0: Double) -> Double {
    let v6: Double = f70(v0)
    let v5: [Double] = [v0]
    let v4: Double = f70(v6)
    let v10: Double = v5[0]
    let v1: Double = v5[0]
    let v7: Double = f70(v10)
    var v3: [Double] = v5
    let v2: Double = v3[0]
    let v9: Double = f70(v10)
    let v11: Double = v7 - v6
    v3[0] = v1
    var v13: Double = v9
    var v17: Double = v13
    let v14: Double = f70(v11)
    let v26: Double = f70(v2)
    v13 = v0
    let v41: Double = f70(v17)
    let v28: Double = v4 + v26
    let v25: [Double] = [v17, v14, v2, v28, v0]
    var v29: [Double] = v25
    let v42: Double = v29[0]
    let v68: Double = v42 / v41
    return v68
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v6: Double = f67(v1)
    let v7: Double = f67(v6)
    let v39: Double = f70(v7)
    return v39
  }
  func benchmark() {
    let v0: s4 = s4(p0: [[s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0]])], [s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])]], p1: [s1(p0: [[s0(p0: [[12.0]], p1: [[13.0], [14.0]])], [s0(p0: [[15.0]], p1: [[16.0], [17.0]])]], p1: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])])])
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
