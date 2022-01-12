  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: [s1]
  }
  struct s4 {
    var p0: [s2]
    var p1: s0
  }
  struct s5 {
    var p0: [s2]
    var p1: [s0]
  }
  func f23(_ v0: s2, _ v1: s0) -> s0 {
    let v6: [[Double]] = v1.p1
    let v5: s0 = v0.p1
    var v8: [[Double]] = v6
    let v2: [[Double]] = v1.p0
    var v9: [[Double]] = v8
    var v3: s2 = v0
    let v11: [Double] = v2[0]
    var v13: s0 = v5
    v9[0] = v11
    v3.p1 = v5
    var v17: s0 = v13
    v17.p0 = v2
    let v23: [s0] = v0.p0
    v13.p1 = v9
    let v15: [[Double]] = v13.p0
    v3 = v0
    v3.p0 = v23
    v13.p1 = v15
    let v28: [[Double]] = v17.p1
    var v20: [s0] = v23
    let v21: s0 = v3.p1
    var v16: [s0] = v23
    var v19: [[Double]] = v28
    var v36: s2 = v3
    v13.p0 = v6
    var v70: s2 = v36
    let v27: s0 = v23[1]
    v17 = v27
    let v22: s0 = v70.p1
    v13.p0 = v8
    let v29: [[Double]] = v27.p1
    v13.p1 = v29
    var v79: [[Double]] = v15
    let v65: [s0] = v70.p0
    v70.p0 = v23
    let v50: [s0] = v70.p0
    let v33: [s0] = v70.p0
    v17.p0 = v8
    var v32: s2 = v70
    v3.p0 = v33
    var v48: s0 = v5
    v16 = v23
    v32.p0 = v20
    v3.p0 = v16
    v36.p1 = v13
    var v105: s2 = v32
    v36.p1 = v21
    v48.p0 = v19
    v36.p1 = v22
    var v86: s2 = v70
    v70.p0 = v16
    let v185: [s2] = [v105, v105, v86, v3, v86, v32, v70]
    let v167: s2 = v185[6]
    let v68: s0 = v167.p1
    let v128: [s0] = v0.p0
    v17.p1 = v79
    v32.p0 = v50
    let v279: [s0] = v32.p0
    v48.p1 = v9
    v17.p1 = v19
    v32.p0 = v279
    v70.p0 = v65
    v105.p0 = v128
    v32.p1 = v48
    v32.p0 = v23
    return v68
  }
  func f4(_ v0: s4) -> s4 {
    var v3: s4 = v0
    let v6: [s2] = v0.p0
    var v8: [s2] = v6
    let v1: s2 = v8[0]
    let v2: s2 = v6[0]
    let v5: s0 = v1.p1
    v8[0] = v1
    let v9: s2 = v8[0]
    v8 = v6
    var v11: [s2] = v8
    let v10: s0 = f23(v2, v5)
    v11[0] = v2
    let v15: s2 = v11[0]
    v11[0] = v1
    var v12: s0 = v5
    v8[0] = v15
    v11[0] = v2
    let v20: s0 = v3.p1
    let v19: s0 = v1.p1
    v8[0] = v15
    v11[0] = v15
    v11[0] = v9
    let v31: s2 = v11[0]
    let v30: s0 = f23(v31, v20)
    let v16: s2 = v8[0]
    let v36: [s0] = [v20, v10, v12, v5, v30]
    let v29: [s0] = v16.p0
    var v46: s2 = v16
    v11[0] = v2
    v11[0] = v15
    v8[0] = v31
    let v41: s0 = v36[3]
    let v43: [[Double]] = v19.p0
    let v22: [Double] = v43[0]
    let v59: s0 = v46.p1
    v8[0] = v2
    let v106: s4 = s4(p0: v8, p1: v41)
    var v38: [[Double]] = v43
    v38[0] = v22
    v46.p0 = v29
    v38[0] = v22
    v38[0] = v22
    v8[0] = v2
    v3.p1 = v59
    v12.p0 = v38
    return v106
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [s3], _ v2: [s5], _ v3: [s0], _ v4: Double) -> Double {
    let v6: s4 = v0[0]
    let v8: s0 = v3[1]
    var v5: s0 = v8
    let v19: s4 = f4(v6)
    let v25: s0 = v19.p1
    let v11: [s2] = v19.p0
    let v26: s2 = v11[0]
    let v37: s0 = f23(v26, v8)
    let v45: s0 = v26.p1
    let v44: s0 = f23(v26, v8)
    let v33: s2 = s2(p0: v3, p1: v45)
    var v42: s2 = v26
    v42 = v26
    let v43: s0 = f23(v42, v44)
    let v61: [[Double]] = v43.p0
    v5.p1 = v61
    let v39: [[Double]] = v37.p1
    let v85: [[Double]] = v25.p1
    v5.p1 = v85
    let v99: s0 = f23(v33, v5)
    let v106: [Double] = v61[0]
    var v128: [Double] = v106
    v42.p1 = v99
    v42.p1 = v45
    let v86: Double = v128[0]
    v5.p1 = v39
    return v86
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [s2(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]]))], p1: s0(p0: [[6.0]], p1: [[7.0]])), s4(p0: [s2(p0: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0]]))], p1: s0(p0: [[14.0]], p1: [[15.0]])), s4(p0: [s2(p0: [s0(p0: [[16.0]], p1: [[17.0]]), s0(p0: [[18.0]], p1: [[19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0]]))], p1: s0(p0: [[22.0]], p1: [[23.0]]))]
    let v1: [s3] = [s3(p0: s2(p0: [s0(p0: [[24.0]], p1: [[25.0]]), s0(p0: [[26.0]], p1: [[27.0]])], p1: s0(p0: [[28.0]], p1: [[29.0]])), p1: [s1(p0: [s0(p0: [[30.0]], p1: [[31.0]]), s0(p0: [[32.0]], p1: [[33.0]]), s0(p0: [[34.0]], p1: [[35.0]])], p1: [s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]])]), s1(p0: [s0(p0: [[40.0]], p1: [[41.0]]), s0(p0: [[42.0]], p1: [[43.0]]), s0(p0: [[44.0]], p1: [[45.0]])], p1: [s0(p0: [[46.0]], p1: [[47.0]]), s0(p0: [[48.0]], p1: [[49.0]])])])]
    let v2: [s5] = [s5(p0: [s2(p0: [s0(p0: [[50.0]], p1: [[51.0]]), s0(p0: [[52.0]], p1: [[53.0]])], p1: s0(p0: [[54.0]], p1: [[55.0]])), s2(p0: [s0(p0: [[56.0]], p1: [[57.0]]), s0(p0: [[58.0]], p1: [[59.0]])], p1: s0(p0: [[60.0]], p1: [[61.0]]))], p1: [s0(p0: [[62.0]], p1: [[63.0]])]), s5(p0: [s2(p0: [s0(p0: [[64.0]], p1: [[65.0]]), s0(p0: [[66.0]], p1: [[67.0]])], p1: s0(p0: [[68.0]], p1: [[69.0]])), s2(p0: [s0(p0: [[70.0]], p1: [[71.0]]), s0(p0: [[72.0]], p1: [[73.0]])], p1: s0(p0: [[74.0]], p1: [[75.0]]))], p1: [s0(p0: [[76.0]], p1: [[77.0]])]), s5(p0: [s2(p0: [s0(p0: [[78.0]], p1: [[79.0]]), s0(p0: [[80.0]], p1: [[81.0]])], p1: s0(p0: [[82.0]], p1: [[83.0]])), s2(p0: [s0(p0: [[84.0]], p1: [[85.0]]), s0(p0: [[86.0]], p1: [[87.0]])], p1: s0(p0: [[88.0]], p1: [[89.0]]))], p1: [s0(p0: [[90.0]], p1: [[91.0]])])]
    let v3: [s0] = [s0(p0: [[92.0]], p1: [[93.0]]), s0(p0: [[94.0]], p1: [[95.0]])]
    let v4: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
