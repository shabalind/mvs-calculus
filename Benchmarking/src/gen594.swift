  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f97(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v1: [[Double]] = v7.p1
    let v9: [Double] = v1[2]
    v7.p1 = v1
    v7.p1 = v1
    let v4: [Double] = v1[0]
    let v6: [[Double]] = v7.p1
    var v8: [[Double]] = v6
    v8[0] = v9
    let v3: [[Double]] = v7.p0
    let v11: [[Double]] = v0.p1
    v8[2] = v4
    let v5: [Double] = v3[1]
    v8[1] = v5
    v7.p1 = v11
    v7.p1 = v8
    v7.p0 = v3
    return v7
  }
  func f95(_ v0: [s0]) -> [s0] {
    let v6: s0 = v0[0]
    let v4: s0 = f97(v6)
    var v3: [s0] = v0
    v3[0] = v4
    v3[0] = v4
    var v2: [s0] = v3
    let v12: s1 = s1(p0: v6, p1: v6)
    let v11: s0 = v12.p0
    let v29: s0 = f97(v11)
    v3[0] = v29
    let v89: s0 = v2[0]
    v2[0] = v89
    v2 = v3
    return v2
  }
  func f94(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v1: s0 = f97(v7)
    let v5: [[Double]] = v0.p1
    let v4: [[Double]] = v0.p1
    let v8: [Double] = v5[2]
    let v9: [Double] = v5[0]
    var v3: [Double] = v9
    let v11: s0 = f97(v7)
    let v2: [[Double]] = v1.p1
    v3 = v9
    let v10: [[Double]] = v1.p0
    var v12: [[Double]] = v10
    let v13: [Double] = v2[1]
    let v26: Double = v9[0]
    var v18: [[Double]] = v2
    v3 = v8
    let v25: [Double] = v4[2]
    let v20: [[Double]] = v0.p1
    var v22: [[Double]] = v20
    v7.p1 = v2
    var v29: Double = v26
    let v32: s0 = f97(v7)
    v18[0] = v8
    v12[1] = v8
    v18[2] = v13
    var v70: Double = v29
    let v42: [Double] = v12[0]
    v12 = v10
    let v39: [[Double]] = v32.p1
    v3[0] = v29
    v7.p1 = v18
    v7.p1 = v39
    let v37: [s0] = [v11]
    v22[2] = v3
    v18[1] = v42
    v22[1] = v3
    let v51: s0 = v37[0]
    v18[0] = v9
    v18[0] = v25
    v18[0] = v3
    var v86: s0 = v51
    v7.p0 = v12
    v86.p1 = v22
    v29 = v70
    return v86
  }
  func f88(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v6: s0 = f97(v0)
    let v7: [[Double]] = v6.p0
    v2.p0 = v7
    v2.p0 = v7
    let v3: [[Double]] = v2.p1
    var v4: [[Double]] = v7
    let v1: [Double] = v7[0]
    var v5: [Double] = v1
    v4[0] = v5
    let v8: s0 = f94(v0)
    let v11: Double = v1[0]
    v4[1] = v5
    let v15: [[Double]] = v6.p1
    let v19: s0 = f97(v0)
    let v14: Double = v11 + v11
    v5[0] = v14
    v2.p0 = v4
    v2.p1 = v15
    let v35: [[Double]] = v6.p1
    let v24: s0 = f94(v8)
    let v45: [[Double]] = v24.p1
    let v33: [[Double]] = v19.p1
    v2.p1 = v3
    v2.p1 = v35
    v2.p1 = v33
    let v61: s0 = f97(v2)
    v2.p0 = v4
    v2.p1 = v45
    v2.p1 = v15
    v4[1] = v5
    return v61
  }
  func f86(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v2: s0 = f88(v0)
    let v4: [Double] = v3[1]
    let v5: [[Double]] = v2.p0
    let v1: s0 = f94(v2)
    let v9: [[Double]] = v2.p0
    let v7: [[Double]] = v2.p1
    var v18: s0 = v0
    v18.p1 = v7
    let v11: s0 = f94(v18)
    let v23: [[Double]] = v18.p0
    let v43: s0 = s0(p0: v5, p1: v7)
    let v14: s0 = f88(v18)
    var v12: [[Double]] = v7
    v18.p1 = v7
    v18.p0 = v23
    let v47: [[Double]] = v14.p1
    var v15: s0 = v43
    var v34: [[Double]] = v12
    let v32: s0 = f88(v15)
    let v13: s0 = f94(v0)
    let v22: s0 = f94(v18)
    var v35: s0 = v11
    let v26: [[Double]] = v35.p0
    let v27: s0 = f88(v1)
    var v41: [[Double]] = v7
    v15.p1 = v34
    let v54: s0 = s0(p0: v26, p1: v47)
    let v110: s0 = f97(v27)
    let v61: [[Double]] = v32.p1
    let v72: [Double] = v61[1]
    var v57: [[Double]] = v9
    let v45: s0 = f97(v13)
    let v142: [[Double]] = v45.p0
    v34 = v41
    v35 = v22
    let v108: s0 = f94(v110)
    v34[0] = v72
    v35.p0 = v142
    let v94: [Double] = v57[1]
    let v80: [[Double]] = v108.p1
    v35.p1 = v7
    v35.p0 = v9
    v18.p1 = v80
    v18.p1 = v61
    v34[2] = v4
    let v95: s0 = f97(v54)
    let v85: s0 = f88(v1)
    v18.p0 = v23
    v34[0] = v72
    v35 = v85
    v34[0] = v94
    v57 = v9
    v18.p1 = v7
    v18.p1 = v41
    return v95
  }
  func f80(_ v0: [s0]) -> [s0] {
    let v2: [s0] = f95(v0)
    let v5: [s0] = f95(v0)
    let v8: [s0] = f95(v2)
    let v3: s0 = v5[0]
    var v1: [s0] = v8
    var v4: s0 = v3
    var v7: s0 = v4
    let v15: s0 = f97(v4)
    let v10: s0 = f94(v15)
    let v9: [[Double]] = v10.p1
    v7.p1 = v9
    let v11: s0 = f88(v7)
    let v13: [[Double]] = v3.p0
    let v14: s0 = f86(v3)
    v4.p1 = v9
    v1[0] = v11
    let v19: s0 = v0[0]
    let v24: [[Double]] = v19.p0
    let v27: [[Double]] = v7.p0
    v1[0] = v14
    let v35: [[Double]] = v4.p0
    v4.p0 = v35
    v4.p0 = v24
    v7.p0 = v13
    v7.p0 = v27
    var v28: [[Double]] = v35
    v7.p0 = v35
    v4.p0 = v28
    let v68: [s0] = f95(v1)
    v7.p0 = v27
    return v68
  }
  func f78(_ v0: s0, _ v1: s0) -> s0 {
    let v9: s0 = f94(v1)
    let v6: [[Double]] = v9.p1
    let v11: [[Double]] = v1.p1
    let v7: [[Double]] = v0.p0
    var v28: s0 = v0
    v28.p1 = v11
    let v13: [[Double]] = v1.p1
    v28.p0 = v7
    let v71: [[Double]] = v9.p0
    var v29: s0 = v28
    let v22: s1 = s1(p0: v0, p1: v28)
    let v72: s0 = v22.p0
    v29.p0 = v71
    let v37: [[Double]] = v72.p0
    v28.p1 = v6
    v29.p1 = v13
    v29.p0 = v37
    return v29
  }
  func f45(_ v0: [s0]) -> [s0] {
    let v2: [s0] = f80(v0)
    let v7: s0 = v2[0]
    let v6: s0 = v2[0]
    let v9: s0 = f78(v7, v7)
    let v1: s0 = v2[0]
    let v4: s0 = f78(v9, v6)
    var v5: s0 = v9
    let v3: s0 = v0[0]
    let v8: s0 = v0[0]
    let v15: s1 = s1(p0: v4, p1: v3)
    let v10: s0 = v15.p0
    var v13: s0 = v10
    v5 = v10
    let v27: s0 = f86(v5)
    var v12: s0 = v10
    let v34: [[Double]] = v12.p0
    var v17: s0 = v8
    var v18: [s0] = v0
    let v30: [[Double]] = v1.p1
    v13.p1 = v30
    v18[0] = v13
    v5.p0 = v34
    var v20: [s0] = v18
    let v19: [[Double]] = v27.p0
    v17.p0 = v19
    let v46: s0 = v15.p1
    v18[0] = v17
    v12.p1 = v30
    v5 = v46
    let v57: [[Double]] = v27.p0
    v18[0] = v8
    var v73: [[Double]] = v30
    v5.p0 = v57
    v17.p1 = v73
    return v20
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v8: s0 = v0[0]
    var v7: Double = v2
    v7 = v2
    v7 = v2
    var v15: s1 = v1
    let v9: s0 = v0[0]
    v15.p0 = v8
    let v6: s0 = v0[0]
    v7 = v2
    var v10: Double = v7
    let v13: s0 = v15.p1
    let v19: s0 = v0[0]
    var v23: [s0] = v0
    var v34: Double = v7
    v23[0] = v6
    v34 = v10
    let v22: s0 = v0[0]
    v34 = v2
    let v29: s0 = v1.p0
    var v14: Double = v10
    let v35: [s0] = f45(v23)
    let v51: s0 = v35[0]
    let v38: Double = v34 - v34
    v23[0] = v9
    v15.p1 = v19
    var v27: Double = v7
    let v53: [[Double]] = v51.p0
    let v65: [Double] = v53[0]
    v23[0] = v13
    let v47: Double = v65[0]
    var v31: [Double] = v65
    var v95: [Double] = v31
    let v82: Double = v95[0]
    v10 = v27
    v95[0] = v82
    v95[0] = v14
    let v81: Double = v47 * v82
    v15.p0 = v22
    v15.p1 = v29
    var v170: Double = v81
    v27 = v14
    v31[0] = v38
    return v170
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])]
    let v1: s1 = s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]))
    let v2: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
