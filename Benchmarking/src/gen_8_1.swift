  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
  }
  struct s4 {
    var p0: s2
    var p1: [s0]
  }
  struct s5 {
    var p0: s2
    var p1: [s4]
  }
  func f122(_ v0: s0, _ v1: s2) -> s2 {
    let v17: s1 = v1.p0
    let v33: s2 = s2(p0: v17)
    let v26: s1 = v33.p0
    var v51: s2 = v33
    let v103: [s2] = [v51, v33, v33]
    let v167: s2 = v103[0]
    v51.p0 = v26
    return v167
  }
  func f115(_ v0: s1, _ v1: s4) -> s1 {
    let v6: s2 = v1.p0
    var v3: s2 = v6
    v3.p0 = v0
    let v32: s1 = v3.p0
    return v32
  }
  func f103(_ v0: s4, _ v1: s4) -> s4 {
    var v3: s4 = v1
    let v8: [s0] = v3.p1
    var v11: s4 = v1
    let v5: s0 = v8[0]
    var v7: s0 = v5
    let v6: s0 = v8[0]
    v3.p1 = v8
    var v12: [s0] = v8
    v3.p1 = v12
    v12[0] = v7
    let v10: s0 = v12[0]
    let v4: s0 = v12[0]
    var v9: s4 = v3
    let v14: s0 = v12[0]
    let v2: s2 = v1.p0
    let v21: s0 = v8[0]
    let v25: s2 = v3.p0
    v12[0] = v4
    v9.p0 = v25
    v9.p0 = v2
    v12[0] = v10
    v12[0] = v14
    let v26: s0 = v12[0]
    let v15: s1 = v25.p0
    let v18: s2 = f122(v5, v25)
    let v30: s1 = f115(v15, v0)
    let v23: [Double] = v7.p1
    let v16: s2 = s2(p0: v15)
    v12[0] = v7
    let v24: [[Double]] = v6.p0
    var v20: s1 = v30
    v11 = v0
    let v75: s0 = v20.p1
    v12[0] = v6
    var v28: [s0] = v12
    let v48: Double = v23[1]
    var v35: s1 = v30
    let v47: [[Double]] = v14.p0
    let v57: [s0] = v35.p0
    let v40: s1 = v16.p0
    var v29: s2 = v16
    v20.p0 = v57
    v3 = v9
    let v38: s1 = f115(v40, v1)
    v35.p1 = v6
    v20.p1 = v5
    let v44: s1 = f115(v38, v11)
    let v65: [Double] = v24[0]
    v28[0] = v5
    let v33: [Double] = v21.p1
    v29.p0 = v44
    var v98: s0 = v7
    let v46: [[Double]] = v5.p0
    let v37: [s0] = v1.p1
    v29.p0 = v30
    v28 = v37
    var v85: [[Double]] = v46
    var v41: [Double] = v33
    v35.p0 = v57
    var v108: s2 = v29
    v12[0] = v75
    let v160: s0 = v12[0]
    let v89: s1 = f115(v35, v0)
    v12 = v28
    v85[0] = v65
    v9.p0 = v25
    v3.p0 = v18
    let v45: [Double] = v47[0]
    v85[0] = v65
    v28[0] = v26
    v85[0] = v45
    v41[1] = v48
    v12[0] = v160
    v85 = v46
    let v74: s4 = s4(p0: v108, p1: v28)
    v3.p0 = v16
    v20.p0 = v57
    let v113: [Double] = v85[0]
    v29.p0 = v89
    let v182: Double = v113[0]
    v41[1] = v182
    v7.p1 = v41
    v7 = v98
    v11.p1 = v8
    return v74
  }
  func f99(_ v0: Double) -> Double {
    var v8: Double = v0
    var v4: Double = v0
    var v3: Double = v4
    var v1: Double = v3
    let v2: [Double] = [v0, v1, v1, v3]
    var v9: [Double] = v2
    v9[1] = v8
    let v7: [[Double]] = [v9, v2, v2, v9, v9]
    v9[0] = v3
    var v15: [[Double]] = v7
    let v23: [Double] = v15[3]
    var v12: [Double] = v23
    v12[1] = v3
    let v22: Double = v12[0]
    return v22
  }
  func f95(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    var v4: s0 = v0
    let v7: [Double] = v4.p1
    let v9: [Double] = v1[0]
    var v8: [[Double]] = v1
    let v11: Double = v9[0]
    var v14: Double = v11
    var v13: s0 = v4
    v8[0] = v9
    let v20: [Double] = v8[0]
    let v19: [Double] = v0.p1
    var v21: [[Double]] = v8
    let v25: [Double] = v4.p1
    let v36: [[Double]] = v0.p0
    var v15: [Double] = v20
    let v17: [Double] = v4.p1
    v4.p0 = v36
    let v43: [Double] = v13.p1
    let v55: Double = f99(v14)
    let v30: [Double] = v13.p1
    let v26: s0 = s0(p0: v36, p1: v7)
    v13.p1 = v19
    v13.p1 = v17
    let v93: [[Double]] = v0.p0
    var v52: [[Double]] = v93
    var v31: s0 = v13
    v52[0] = v15
    let v23: Double = f99(v55)
    let v76: [Double] = v36[0]
    let v58: [[Double]] = v31.p0
    v52[0] = v20
    let v40: [[Double]] = v26.p0
    v21 = v52
    v8[0] = v9
    v8[0] = v76
    let v92: [Double] = v31.p1
    v31.p1 = v92
    var v83: Double = v23
    v13.p1 = v17
    let v53: [[[Double]]] = [v93, v52, v21, v58, v36, v21, v40]
    v13.p0 = v1
    v15[0] = v83
    v13.p0 = v52
    v4.p0 = v1
    v13.p1 = v30
    v13.p1 = v43
    let v85: [[Double]] = v53[4]
    v31.p0 = v1
    let v78: [[Double]] = v13.p0
    v4.p0 = v85
    var v97: s0 = v13
    v97.p1 = v25
    v97.p0 = v78
    v31.p0 = v93
    return v97
  }
  func f93(_ v0: [s0]) -> [s0] {
    let v5: s0 = v0[0]
    let v3: s0 = f95(v5)
    let v2: [[s0]] = [v0]
    let v17: s0 = v0[0]
    let v9: [[Double]] = v17.p0
    let v11: s0 = f95(v3)
    let v6: s0 = v0[0]
    let v7: s0 = v0[0]
    var v12: [s0] = v0
    let v10: [Double] = v3.p1
    let v20: [[Double]] = v5.p0
    var v15: s0 = v11
    let v25: [s0] = v2[0]
    let v16: [Double] = v11.p1
    let v21: [s0] = v2[0]
    let v33: s0 = f95(v17)
    v12[0] = v5
    let v32: s0 = f95(v17)
    let v29: s0 = s0(p0: v9, p1: v16)
    let v24: s0 = s0(p0: v20, p1: v10)
    v12[0] = v15
    v12[0] = v33
    let v31: [Double] = v20[0]
    let v50: [s0] = v2[0]
    let v43: [[s0]] = [v12, v21, v50, v25]
    v15.p0 = v9
    var v63: [s0] = v25
    let v36: [[Double]] = v24.p0
    var v80: [Double] = v31
    v12 = v63
    v15.p0 = v20
    v63[0] = v29
    var v49: [[Double]] = v36
    v49[0] = v80
    let v62: s0 = f95(v24)
    let v45: [[Double]] = v29.p0
    v15.p0 = v9
    let v40: [[Double]] = v32.p0
    v49[0] = v31
    v15.p0 = v49
    v15.p0 = v49
    var v101: s0 = v6
    let v124: s0 = f95(v7)
    let v151: [s0] = v43[0]
    v12[0] = v62
    let v289: [[Double]] = v101.p0
    v15.p0 = v40
    v101.p0 = v49
    v15.p0 = v45
    v15.p0 = v289
    let v129: s0 = f95(v124)
    v63[0] = v129
    return v151
  }
  func f91(_ v0: [s0]) -> [s0] {
    let v8: [s0] = f93(v0)
    let v17: [s0] = f93(v8)
    let v40: [s0] = f93(v17)
    var v41: [s0] = v40
    return v41
  }
  func f85(_ v0: s2) -> s2 {
    let v4: s1 = v0.p0
    var v1: s2 = v0
    v1.p0 = v4
    var v42: s2 = v1
    v1 = v42
    return v1
  }
  func f70(_ v0: s2) -> s2 {
    let v2: s2 = f85(v0)
    let v10: s2 = f85(v2)
    var v32: s2 = v10
    return v32
  }
  func f66(_ v0: [s0]) -> [s0] {
    let v5: [s0] = f91(v0)
    let v4: s0 = v5[0]
    var v7: [s0] = v5
    let v2: s0 = v7[0]
    v7[0] = v2
    let v6: s0 = v0[0]
    v7[0] = v6
    var v9: [s0] = v7
    let v12: [Double] = v4.p1
    let v18: s0 = f95(v6)
    let v23: s0 = f95(v18)
    let v30: [[Double]] = v6.p0
    var v33: [s0] = v5
    var v27: s0 = v23
    var v21: [[Double]] = v30
    let v17: [[Double]] = v2.p0
    let v40: [[Double]] = v27.p0
    var v25: [s0] = v33
    var v28: s0 = v27
    let v49: [Double] = v23.p1
    v27.p1 = v12
    v27.p1 = v12
    let v19: [Double] = v17[0]
    v25 = v9
    v27.p0 = v40
    v33[0] = v28
    v28.p1 = v49
    let v50: [[Double]] = v2.p0
    v33[0] = v2
    v27.p0 = v17
    v9[0] = v23
    v28.p0 = v21
    v27.p0 = v50
    var v103: [[Double]] = v21
    v103[0] = v19
    v27.p0 = v103
    v9[0] = v28
    return v25
  }
  func f18(_ v0: s4) -> s4 {
    let v4: s4 = f103(v0, v0)
    var v5: s4 = v4
    var v2: s4 = v0
    let v7: s2 = v5.p0
    v2.p0 = v7
    v5.p0 = v7
    var v22: s4 = v0
    var v17: s2 = v7
    let v24: s2 = v0.p0
    let v10: s2 = v22.p0
    v22.p0 = v10
    v5.p0 = v10
    v2.p0 = v17
    var v27: s2 = v17
    let v26: s1 = v24.p0
    let v16: s2 = f70(v7)
    var v25: s4 = v0
    v25.p0 = v27
    let v72: [s0] = v4.p1
    v27 = v17
    let v46: s4 = s4(p0: v17, p1: v72)
    v25 = v2
    let v55: [s4] = [v5, v25, v46, v0]
    let v98: [s0] = f66(v72)
    v25.p1 = v72
    v17.p0 = v26
    let v89: s4 = v55[0]
    v2.p0 = v16
    v2.p1 = v98
    return v89
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v7: [s4] = v0.p1
    let v3: s4 = v7[0]
    let v17: s4 = f18(v3)
    let v25: [s0] = v17.p1
    let v20: s0 = v25[0]
    let v41: [Double] = v20.p1
    let v122: Double = f99(v1)
    let v104: Double = v41[0]
    let v264: Double = v122 + v104
    return v264
  }
  func benchmark() {
    let v0: s5 = s5(p0: s2(p0: s1(p0: [s0(p0: [[0.0]], p1: [1.0, 2.0]), s0(p0: [[3.0]], p1: [4.0, 5.0]), s0(p0: [[6.0]], p1: [7.0, 8.0])], p1: s0(p0: [[9.0]], p1: [10.0, 11.0]))), p1: [s4(p0: s2(p0: s1(p0: [s0(p0: [[12.0]], p1: [13.0, 14.0]), s0(p0: [[15.0]], p1: [16.0, 17.0]), s0(p0: [[18.0]], p1: [19.0, 20.0])], p1: s0(p0: [[21.0]], p1: [22.0, 23.0]))), p1: [s0(p0: [[24.0]], p1: [25.0, 26.0])]), s4(p0: s2(p0: s1(p0: [s0(p0: [[27.0]], p1: [28.0, 29.0]), s0(p0: [[30.0]], p1: [31.0, 32.0]), s0(p0: [[33.0]], p1: [34.0, 35.0])], p1: s0(p0: [[36.0]], p1: [37.0, 38.0]))), p1: [s0(p0: [[39.0]], p1: [40.0, 41.0])])])
    let v1: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
