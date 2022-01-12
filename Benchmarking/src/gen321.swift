  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: Double
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f51(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p0
    var v3: [[Double]] = v4
    let v7: [Double] = v3[1]
    var v9: [[Double]] = v3
    v3 = v9
    let v14: [s0] = [v0, v0, v0]
    let v6: [[s0]] = [v14, v14, v14, v14, v14, v14]
    let v8: [s0] = v6[0]
    let v10: [[Double]] = v0.p0
    let v18: s0 = v8[2]
    let v16: Double = v18.p2
    let v19: [Double] = v10[1]
    var v34: [Double] = v19
    let v35: s0 = s0(p0: v9, p1: v3, p2: v16)
    v3[1] = v34
    v9[1] = v7
    return v35
  }
  func f43(_ v0: s0, _ v1: [s0]) -> [s0] {
    var v7: s0 = v0
    let v5: s0 = f51(v7)
    var v15: [s0] = v1
    v7 = v5
    var v24: s0 = v7
    var v17: [s0] = v15
    v17[0] = v24
    v15[0] = v7
    return v17
  }
  func f33(_ v0: Double, _ v1: s0) -> Double {
    let v6: s0 = f51(v1)
    var v5: s0 = v6
    var v2: Double = v0
    v5.p2 = v0
    let v8: Double = v1.p2
    v5.p2 = v2
    v5.p2 = v8
    let v13: Double = v5.p2
    v2 = v8
    return v13
  }
  func f31(_ v0: s0) -> s0 {
    let v3: s0 = f51(v0)
    var v5: s0 = v3
    let v10: [[Double]] = v0.p0
    let v6: [Double] = v10[1]
    let v4: [[Double]] = v3.p1
    var v2: [[Double]] = v4
    v5.p1 = v4
    let v7: [[Double]] = v0.p1
    v5.p1 = v10
    let v13: [[Double]] = v5.p1
    let v8: s0 = f51(v5)
    v5.p0 = v13
    let v9: [Double] = v13[1]
    let v12: s0 = f51(v8)
    let v15: [[Double]] = v3.p0
    let v20: s0 = f51(v3)
    v2[1] = v9
    let v18: Double = v20.p2
    let v51: Double = f33(v18, v12)
    let v23: Double = v20.p2
    v5.p2 = v23
    let v54: s0 = f51(v8)
    let v40: [[Double]] = v3.p1
    v5.p0 = v2
    var v36: [[Double]] = v7
    v5.p1 = v15
    var v31: s0 = v54
    v36[1] = v9
    v36[1] = v6
    v31.p0 = v36
    let v37: [[Double]] = v31.p0
    let v97: s0 = s0(p0: v36, p1: v37, p2: v51)
    v5.p0 = v40
    return v97
  }
  func f30(_ v0: s0) -> s0 {
    let v4: s0 = f51(v0)
    let v2: [[Double]] = v0.p0
    let v5: s0 = f51(v4)
    let v7: [s0] = [v5, v5, v0, v0, v4, v5, v5]
    var v1: [s0] = v7
    v1[6] = v0
    let v3: s0 = f51(v5)
    var v6: s0 = v5
    let v9: s0 = f51(v6)
    v1[0] = v5
    v1[1] = v0
    let v22: Double = v5.p2
    let v13: Double = f33(v22, v9)
    let v24: Double = f33(v22, v3)
    let v16: s0 = f31(v3)
    var v51: s0 = v3
    var v23: [s0] = v1
    let v27: s0 = v23[2]
    v51.p0 = v2
    var v30: [[Double]] = v2
    let v39: s0 = v7[5]
    let v41: [Double] = v30[0]
    let v68: Double = v41[0]
    let v28: Double = f33(v68, v51)
    let v35: Double = v39.p2
    let v48: [Double] = [v28, v24, v13, v35, v22, v22, v68]
    let v38: s0 = f51(v6)
    let v123: Double = v48[3]
    let v43: [[Double]] = v51.p1
    v30 = v43
    v23[2] = v9
    var v31: s0 = v0
    let v65: s0 = f51(v38)
    v6.p2 = v123
    v23[5] = v16
    let v81: [[Double]] = v65.p1
    v1[0] = v31
    v31.p0 = v81
    v6.p1 = v81
    return v27
  }
  func f26(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v4: Double = v0.p2
    v5.p2 = v4
    v5 = v0
    let v11: s0 = f51(v5)
    let v16: s0 = f30(v11)
    let v17: s0 = f30(v16)
    return v17
  }
  func f19(_ v0: [s0], _ v1: [s0], _ v2: s0) -> [s0] {
    var v10: [s0] = v0
    return v10
  }
  func f17(_ v0: s1) -> s1 {
    let v5: s0 = v0.p0
    var v3: s0 = v5
    let v1: [s0] = v0.p1
    var v6: s1 = v0
    var v2: s1 = v6
    let v7: s0 = f51(v5)
    let v13: [s0] = f19(v1, v1, v3)
    let v8: [s0] = v6.p1
    v2.p0 = v7
    v6.p0 = v7
    let v9: s0 = v1[1]
    v2.p1 = v8
    let v18: s0 = v1[0]
    let v11: [[Double]] = v3.p0
    var v40: [[Double]] = v11
    let v12: [[Double]] = v18.p1
    var v4: [[Double]] = v12
    let v31: s0 = f26(v9)
    let v16: [Double] = v11[1]
    let v28: [s0] = f19(v8, v13, v31)
    v6.p1 = v28
    let v39: [Double] = v4[0]
    let v53: [s0] = v2.p1
    v40[0] = v16
    v40[0] = v39
    v4[0] = v16
    v6.p1 = v53
    let v46: s0 = f31(v7)
    v3.p1 = v40
    let v56: [s0] = f43(v46, v28)
    v6.p1 = v56
    return v2
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v6: [s0] = v0.p1
    let v8: s1 = f17(v0)
    var v9: s1 = v8
    var v4: [s0] = v6
    let v18: s0 = v6[1]
    let v32: s0 = v9.p0
    v4[0] = v32
    let v14: s0 = v4[0]
    let v19: [[Double]] = v14.p1
    let v26: [Double] = v19[0]
    v4[0] = v18
    let v24: Double = v26[0]
    v9.p1 = v6
    return v24
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: 4.0), p1: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0]], p2: 9.0), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0]], p2: 14.0)])
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
