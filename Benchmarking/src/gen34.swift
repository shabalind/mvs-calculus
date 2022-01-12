  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  func f15(_ v0: s2) -> s2 {
    var v4: s2 = v0
    let v2: s0 = v0.p1
    var v3: s2 = v4
    let v7: [[Double]] = v2.p0
    let v6: s0 = s0(p0: v7, p1: v7)
    let v9: [s2] = [v4, v3, v4, v0]
    let v11: s2 = v9[2]
    let v1: s0 = v4.p1
    var v14: [s2] = v9
    var v19: [s2] = v14
    var v20: [s2] = v19
    var v12: s0 = v6
    v4.p1 = v6
    let v13: s2 = v14[0]
    v4.p1 = v12
    var v27: s2 = v11
    var v21: [[Double]] = v7
    v4.p1 = v1
    v19[3] = v0
    var v22: s2 = v3
    let v48: s2 = v19[0]
    v12.p1 = v21
    let v33: s0 = v22.p1
    var v26: [s2] = v20
    let v23: [[Double]] = v6.p1
    let v49: [Double] = v21[0]
    var v28: s2 = v13
    let v44: [s1] = v4.p0
    var v29: [s1] = v44
    v26[0] = v48
    v28.p1 = v33
    v26 = v20
    v21[0] = v49
    let v30: [[Double]] = v2.p1
    v12.p0 = v21
    let v65: s0 = v27.p1
    let v43: s0 = v28.p1
    let v90: [[Double]] = v43.p1
    let v68: s2 = v26[0]
    let v45: s2 = v9[1]
    v26[3] = v68
    v22.p0 = v29
    v12.p1 = v30
    v14[2] = v45
    var v75: [[Double]] = v23
    v4.p1 = v65
    v12.p1 = v75
    v12.p0 = v90
    v26 = v9
    return v68
  }
  func f9(_ v0: s1) -> s1 {
    let v2: [[s0]] = v0.p0
    let v1: [s0] = v2[1]
    let v10: [s0] = v2[1]
    let v3: s0 = v1[0]
    var v6: s1 = v0
    let v19: s0 = v0.p1
    var v24: s1 = v6
    v24.p1 = v19
    v24.p1 = v19
    let v26: s0 = v24.p1
    let v18: [s1] = [v0, v24, v6, v6, v24, v0]
    let v25: [[s0]] = v6.p0
    let v40: [[s0]] = v6.p0
    var v39: [[s0]] = v25
    let v73: s1 = v18[0]
    v6.p0 = v40
    let v43: s1 = v18[2]
    let v77: s1 = v18[4]
    var v51: [s1] = v18
    v39[0] = v10
    v24.p1 = v26
    let v48: s0 = v43.p1
    let v91: [[s0]] = v24.p0
    v24.p1 = v19
    v6.p0 = v39
    let v41: s1 = v51[3]
    v6.p1 = v48
    v6.p1 = v26
    let v74: [[s0]] = v73.p0
    v6.p0 = v74
    v24.p0 = v2
    v6.p1 = v3
    v6.p0 = v91
    v51[4] = v77
    return v41
  }
  func f8(_ v0: [s1]) -> [s1] {
    var v3: [s1] = v0
    var v8: [s1] = v3
    let v7: s1 = v3[0]
    var v2: [s1] = v8
    v3[0] = v7
    let v11: s1 = f9(v7)
    let v15: s1 = v8[0]
    v8[0] = v11
    v8 = v0
    v2[0] = v15
    v2[0] = v11
    return v2
  }
  func f5(_ v0: s2) -> s2 {
    var v1: s2 = v0
    let v3: [s1] = v0.p0
    let v7: s2 = f15(v0)
    var v10: s2 = v0
    v10 = v1
    v1 = v7
    v1 = v0
    var v29: s2 = v1
    let v12: s2 = f15(v10)
    var v36: s2 = v29
    let v33: [s1] = f8(v3)
    v10.p0 = v3
    let v40: s2 = f15(v12)
    v10.p0 = v33
    v1 = v36
    return v40
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s2, _ v2: Double) -> Double {
    let v3: s2 = v0[0]
    let v7: [s1] = v1.p0
    var v6: s2 = v3
    let v11: s0 = v6.p1
    let v5: s2 = f5(v3)
    v6 = v5
    let v18: [[Double]] = v11.p1
    var v20: [s1] = v7
    let v24: s1 = v20[0]
    let v14: [Double] = v18[1]
    let v44: s0 = v24.p1
    var v25: [s1] = v7
    let v40: s1 = v20[0]
    v25[0] = v40
    let v95: s1 = v20[0]
    let v84: s1 = f9(v95)
    v20[0] = v84
    v6.p0 = v25
    let v122: Double = v14[0]
    v6.p1 = v44
    return v122
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))], p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))]
    let v1: s2 = s2(p0: [s1(p0: [[s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]))], p1: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]))
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
