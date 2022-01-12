  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  func f29(_ v0: Double) -> Double {
    var v5: Double = v0
    var v3: Double = v0
    var v8: Double = v3
    var v2: Double = v3
    let v7: [Double] = [v5, v5, v5]
    let v4: Double = v7[0]
    let v6: Double = v7[1]
    var v12: Double = v8
    let v10: Double = v7[2]
    let v13: Double = v7[2]
    var v18: [Double] = v7
    v2 = v4
    v18[2] = v13
    var v15: [Double] = v7
    var v28: [Double] = v15
    v8 = v13
    var v16: [Double] = v28
    v15[1] = v6
    var v20: [Double] = v28
    v18[0] = v12
    let v67: Double = v15[2]
    let v23: [[Double]] = [v28, v16, v28, v18, v18, v28, v15]
    v28[0] = v0
    v15[1] = v67
    var v40: Double = v2
    v18[0] = v2
    var v29: Double = v0
    let v55: Double = v20[2]
    let v33: [Double] = v23[6]
    v28[1] = v40
    var v26: [[Double]] = v23
    v15[1] = v4
    let v25: Double = v13 * v29
    v18[1] = v25
    var v86: [[Double]] = v26
    v28[0] = v55
    v20[2] = v10
    v86[1] = v33
    let v101: [Double] = v26[4]
    let v99: Double = v101[1]
    let v80: Double = v7[1]
    var v92: [Double] = v20
    var v47: Double = v80
    var v93: Double = v99
    let v144: [Double] = v86[0]
    var v74: [Double] = v144
    v74[2] = v10
    let v168: Double = v16[0]
    let v88: Double = v74[1]
    let v191: [Double] = [v47, v80]
    v18[2] = v168
    v86[1] = v92
    v20[0] = v93
    var v272: [Double] = v191
    let v94: Double = v272[0]
    v74[0] = v94
    return v88
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s2, _ v2: [s1], _ v3: Double) -> Double {
    var v7: Double = v3
    let v14: Double = f29(v7)
    v7 = v3
    let v29: Double = v7 - v14
    return v29
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0]])
    let v1: s2 = s2(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0]], p2: [[10.0], [11.0]]), p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]], p2: [[16.0], [17.0]])])
    let v2: [s1] = [s1(p0: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]], p2: [[22.0], [23.0]])], p1: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]], p2: [[28.0], [29.0]]))]
    let v3: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
