  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: Double
  }
  struct s2 {
    var p0: [s1]
    var p1: [[s1]]
  }
  struct s4 {
    var p0: s1
    var p1: s1
  }
  struct s7 {
    var p0: s2
    var p1: s4
  }
  func f118(_ v0: s4) -> s4 {
    var v3: s4 = v0
    let v1: s1 = v3.p0
    let v2: Double = v1.p1
    var v7: s4 = v0
    let v6: [[s0]] = v1.p0
    v7.p1 = v1
    v3 = v0
    var v12: s4 = v7
    let v11: s1 = s1(p0: v6, p1: v2)
    let v10: s1 = v0.p1
    let v14: s1 = v12.p1
    v7.p0 = v11
    v3.p1 = v10
    v3.p0 = v14
    v7.p0 = v1
    return v12
  }
  func f114(_ v0: s7, _ v1: [s1]) -> [s1] {
    let v8: s4 = v0.p1
    var v3: s7 = v0
    var v7: [s1] = v1
    var v2: s7 = v3
    let v6: s1 = v7[1]
    var v13: s1 = v6
    var v11: s7 = v3
    let v12: s2 = v3.p0
    let v15: [[s1]] = v12.p1
    v11 = v2
    v11.p1 = v8
    let v26: s4 = f118(v8)
    v11.p0 = v12
    let v10: s1 = v1[1]
    let v18: s1 = v1[1]
    v2.p0 = v12
    let v32: s4 = v2.p1
    let v19: [s1] = v15[0]
    let v28: s4 = v11.p1
    let v24: s4 = f118(v28)
    var v25: s4 = v26
    v3.p1 = v25
    let v57: s1 = v19[0]
    let v14: [[s0]] = v57.p0
    v7[1] = v18
    let v66: s1 = v24.p1
    v2.p0 = v12
    v2 = v0
    var v48: s2 = v12
    v7[2] = v13
    v11.p0 = v48
    let v78: s1 = v32.p0
    let v94: s2 = v11.p0
    v48.p0 = v7
    v13.p0 = v14
    v7[2] = v10
    v25.p1 = v78
    v25.p0 = v6
    let v147: [s1] = v94.p0
    v13 = v66
    return v147
  }
  func f102(_ v0: s1) -> s1 {
    let v2: Double = v0.p1
    let v1: [[s0]] = v0.p0
    let v3: [[s0]] = v0.p0
    let v5: [s0] = v3[0]
    let v6: [s0] = v1[0]
    var v4: [[s0]] = v1
    let v10: Double = v0.p1
    v4 = v1
    let v9: [[s0]] = v0.p0
    v4[0] = v6
    let v11: Double = v0.p1
    let v17: s0 = v6[0]
    let v12: [[s0]] = v0.p0
    let v13: [s0] = v3[0]
    let v19: s1 = s1(p0: v12, p1: v10)
    let v36: Double = v19.p1
    var v28: [s0] = v5
    v4[0] = v5
    var v47: [s0] = v13
    let v27: s1 = s1(p0: v9, p1: v11)
    var v46: s1 = v0
    v4[0] = v28
    let v70: [s1] = [v0, v46, v27, v46]
    v46.p1 = v2
    let v52: Double = v19.p1
    v46.p1 = v36
    var v34: [s0] = v47
    v46.p0 = v12
    v34[0] = v17
    let v74: s0 = v34[0]
    let v78: [[Double]] = v17.p1
    let v87: [[Double]] = v74.p1
    let v159: s1 = v70[3]
    v4 = v9
    var v71: s0 = v17
    v46.p0 = v4
    let v84: [Double] = v87[0]
    v46.p1 = v52
    var v51: [[Double]] = v78
    v51[0] = v84
    v4[0] = v5
    v34 = v6
    v71.p1 = v51
    v47 = v13
    v28[0] = v71
    return v159
  }
  func f94(_ v0: s2, _ v1: s4) -> s2 {
    var v6: s2 = v0
    let v11: [[s1]] = v6.p1
    let v10: [s1] = v0.p0
    v6.p1 = v11
    v6.p0 = v10
    return v6
  }
  func f92(_ v0: s4) -> s4 {
    let v1: s1 = v0.p0
    let v6: s1 = f102(v1)
    let v2: s4 = f118(v0)
    var v8: s1 = v1
    let v17: Double = v1.p1
    let v15: s4 = f118(v2)
    let v27: [[s0]] = v6.p0
    let v43: s4 = f118(v15)
    let v31: s1 = v43.p1
    v8.p0 = v27
    v8.p1 = v17
    v8.p1 = v17
    let v105: s4 = s4(p0: v8, p1: v31)
    return v105
  }
  func f50(_ v0: s1) -> s1 {
    let v2: Double = v0.p1
    var v12: Double = v2
    var v5: s1 = v0
    let v9: Double = v2 + v2
    v5.p1 = v12
    v5.p1 = v2
    v5.p1 = v9
    return v5
  }
  func f35(_ v0: s2) -> s2 {
    let v6: [s1] = v0.p0
    let v7: s1 = v6[0]
    var v4: s2 = v0
    let v3: s1 = v6[1]
    v4.p0 = v6
    let v5: [[s1]] = [v6, v6, v6, v6, v6]
    v4.p0 = v6
    let v2: s1 = v6[0]
    v4.p0 = v6
    let v8: s1 = f102(v7)
    var v1: [[s1]] = v5
    let v10: s4 = s4(p0: v2, p1: v2)
    let v9: s4 = f92(v10)
    var v13: s4 = v9
    v13.p0 = v3
    var v12: [[s1]] = v1
    let v21: s1 = v6[1]
    var v20: s2 = v0
    let v17: s1 = f50(v8)
    v13.p0 = v17
    let v18: [s1] = v4.p0
    let v19: [s1] = v20.p0
    let v31: s2 = f94(v20, v13)
    let v28: s4 = f118(v13)
    let v32: [s1] = v12[2]
    let v27: [s1] = v12[0]
    let v46: s4 = f118(v28)
    let v25: [s1] = v12[1]
    v4.p0 = v25
    let v47: [[s1]] = v31.p1
    let v29: s7 = s7(p0: v31, p1: v28)
    var v33: s2 = v4
    let v70: [s1] = f114(v29, v27)
    let v58: s1 = f50(v3)
    var v61: s1 = v58
    v1[0] = v18
    let v52: s1 = v6[1]
    v12[0] = v18
    v20.p0 = v19
    v1[3] = v27
    var v67: s2 = v33
    v13.p0 = v61
    let v81: [s1] = v67.p0
    v13.p1 = v21
    v12[2] = v27
    let v179: [s1] = v31.p0
    v20.p0 = v179
    v1[0] = v32
    v4.p1 = v47
    v67.p1 = v47
    let v126: s2 = f94(v31, v46)
    v12[3] = v81
    v20.p0 = v70
    v13.p0 = v52
    return v126
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v4: [s1] = v0.p0
    let v3: s1 = v4[2]
    let v10: s1 = f50(v3)
    let v6: s2 = f35(v0)
    let v30: [Double] = [v1, v1, v1]
    let v14: s2 = f35(v6)
    var v31: s1 = v10
    var v28: s2 = v14
    let v51: Double = v30[1]
    let v49: Double = v31.p1
    var v48: Double = v49
    let v82: [[s1]] = v28.p1
    let v180: [s1] = v82[1]
    let v131: Double = v51 - v48
    let v116: s1 = v180[0]
    let v70: [[s0]] = v116.p0
    v31.p0 = v70
    return v131
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: 3.0), s1(p0: [[s0(p0: [[4.0], [5.0]], p1: [[6.0]])]], p1: 7.0), s1(p0: [[s0(p0: [[8.0], [9.0]], p1: [[10.0]])]], p1: 11.0)], p1: [[s1(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]])]], p1: 15.0)], [s1(p0: [[s0(p0: [[16.0], [17.0]], p1: [[18.0]])]], p1: 19.0)]])
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
