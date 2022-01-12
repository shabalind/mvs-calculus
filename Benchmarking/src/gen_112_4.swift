  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: s3
    var p1: Double
  }
  struct s5 {
    var p0: [s0]
    var p1: [s2]
  }
  struct s7 {
    var p0: s5
    var p1: [s4]
  }
  struct s8 {
    var p0: Double
  }
  struct s13 {
    var p0: s7
    var p1: s0
  }
  func f52(_ v0: s3) -> s3 {
    let v6: [s0] = v0.p1
    let v4: s0 = v6[0]
    let v1: [s0] = v0.p1
    let v7: s0 = v1[1]
    let v5: Double = v4.p1
    let v9: s4 = s4(p0: v0, p1: v5)
    var v2: [s0] = v6
    v2[1] = v4
    let v15: [[Double]] = v7.p0
    v2 = v1
    v2[0] = v4
    let v13: s0 = v2[0]
    let v8: [Double] = v15[1]
    var v18: s3 = v0
    let v14: s0 = v6[0]
    v18.p1 = v6
    let v24: s3 = v9.p0
    let v27: Double = v8[0]
    v18.p1 = v6
    let v19: Double = v13.p1
    v18.p1 = v6
    let v26: [Double] = v15[0]
    v18.p1 = v6
    let v31: Double = v26[0]
    v2[0] = v7
    var v25: s4 = v9
    v2[1] = v4
    let v21: s0 = v1[0]
    v2[1] = v4
    var v32: s3 = v0
    var v33: s0 = v4
    v2[0] = v4
    let v40: s3 = v9.p0
    v18.p1 = v2
    v2[0] = v13
    v32.p1 = v1
    v25.p1 = v5
    var v22: [s0] = v2
    v22[1] = v7
    let v28: s0 = v22[1]
    v18.p1 = v6
    let v45: [s0] = v18.p0
    var v46: [s0] = v45
    v22[1] = v33
    v2 = v6
    let v35: [s0] = v18.p0
    let v110: s0 = s0(p0: v15, p1: v19)
    v25.p1 = v27
    v2 = v6
    let v60: s0 = v35[2]
    v22[0] = v110
    v25.p0 = v24
    let v74: s3 = v25.p0
    v25.p0 = v32
    let v36: [s0] = [v33, v28, v14, v21, v7, v7]
    let v88: [[Double]] = v14.p0
    var v39: s4 = v25
    v33.p0 = v88
    var v34: s4 = v25
    v25 = v34
    let v50: [s0] = v32.p1
    v39.p0 = v74
    v25.p0 = v18
    let v70: s0 = v36[4]
    v39.p0 = v0
    v25 = v39
    v39.p0 = v40
    var v68: s3 = v74
    v32.p0 = v46
    v2[1] = v28
    v46[1] = v4
    v22[1] = v70
    var v66: [s0] = v50
    v66[1] = v13
    v66 = v22
    v32.p0 = v46
    v32.p1 = v1
    v2[0] = v60
    v34.p1 = v31
    v68.p0 = v45
    v68.p1 = v66
    return v68
  }
  func f51(_ v0: s3) -> s3 {
    let v5: [s0] = v0.p1
    let v7: s0 = v5[1]
    var v6: s3 = v0
    let v3: s0 = v5[1]
    let v4: s0 = v5[0]
    let v8: s3 = f52(v6)
    var v1: s3 = v8
    let v2: [s0] = v8.p1
    var v9: s3 = v6
    var v11: s0 = v7
    let v12: Double = v3.p1
    var v25: [s0] = v2
    var v18: [s0] = v5
    let v17: s0 = v5[1]
    var v26: Double = v12
    v9.p1 = v5
    let v31: s3 = f52(v8)
    var v21: Double = v26
    let v19: s3 = f52(v31)
    let v28: [s0] = v9.p0
    let v36: s3 = f52(v1)
    let v47: [s0] = v19.p1
    var v32: s3 = v36
    v9 = v36
    let v66: s4 = s4(p0: v36, p1: v21)
    v1.p0 = v28
    v6.p1 = v2
    v18[1] = v7
    let v101: Double = v17.p1
    v25[0] = v4
    v11.p1 = v101
    v9.p1 = v47
    v32.p1 = v18
    v18 = v25
    let v242: [s0] = v31.p1
    v6.p1 = v25
    v32.p1 = v242
    let v115: s3 = v66.p0
    let v133: [s0] = v115.p1
    v18[0] = v11
    v6.p1 = v133
    return v32
  }
  func f33(_ v0: s3) -> s3 {
    let v2: s3 = f52(v0)
    let v1: [s0] = v0.p0
    let v3: [s0] = v0.p0
    let v7: [s0] = v0.p1
    let v8: s0 = v3[1]
    let v10: [s0] = v2.p1
    let v12: [s0] = v0.p1
    let v9: s0 = v1[2]
    var v17: [s0] = v10
    v17[0] = v9
    let v20: s0 = v7[0]
    let v13: [s0] = v0.p0
    let v5: s3 = f52(v0)
    v17[0] = v20
    v17 = v12
    let v22: s3 = f52(v5)
    v17[0] = v8
    var v19: s3 = v2
    let v25: [s0] = v19.p0
    v19.p1 = v10
    v19 = v22
    v19.p0 = v25
    v17[1] = v9
    v19.p0 = v13
    let v38: s3 = f52(v19)
    var v91: s3 = v38
    v19 = v2
    v19.p1 = v12
    let v73: s3 = f52(v19)
    v19.p1 = v17
    v19 = v73
    return v91
  }
  func f22(_ v0: s4) -> s4 {
    let v5: s3 = v0.p0
    var v4: s4 = v0
    v4.p0 = v5
    var v6: s4 = v0
    var v18: s4 = v6
    let v25: s3 = f52(v5)
    let v15: Double = v18.p1
    v6.p1 = v15
    var v21: s4 = v0
    let v32: s8 = s8(p0: v15)
    let v63: Double = v32.p0
    let v85: s3 = f52(v25)
    v6 = v4
    let v38: Double = v32.p0
    v4.p1 = v38
    var v64: Double = v63
    v6.p0 = v85
    v4 = v21
    v18.p1 = v64
    return v18
  }
  func f16(_ v0: s4) -> s4 {
    var v4: s4 = v0
    let v1: s4 = f22(v4)
    let v2: s3 = v4.p0
    var v6: s3 = v2
    v4.p0 = v2
    v4.p0 = v2
    let v5: s4 = f22(v1)
    let v7: s3 = f51(v2)
    v4.p0 = v7
    let v13: s4 = f22(v1)
    let v11: s3 = f51(v6)
    let v17: s3 = v13.p0
    let v10: [s0] = v17.p0
    v6 = v7
    let v18: s0 = v10[0]
    var v22: s3 = v17
    let v27: [s0] = v2.p1
    let v36: [s0] = v17.p0
    let v46: [s0] = v11.p0
    v22.p0 = v36
    var v97: s4 = v13
    v22.p1 = v27
    v97.p0 = v2
    v6.p0 = v36
    v97 = v5
    v4.p0 = v22
    let v76: Double = v18.p1
    let v54: s3 = v13.p0
    v22.p1 = v27
    v97.p0 = v54
    v4.p1 = v76
    v22.p0 = v46
    v4.p0 = v22
    return v97
  }
  @inline(never)
  func f0(_ v0: s13, _ v1: Double) -> Double {
    let v7: s7 = v0.p0
    var v4: s7 = v7
    var v5: Double = v1
    var v15: Double = v5
    let v12: [s4] = v4.p1
    let v18: Double = v15 - v5
    let v17: s4 = v12[2]
    v4.p1 = v12
    var v36: s4 = v17
    let v26: s4 = f16(v36)
    v36.p1 = v15
    var v52: Double = v1
    v36.p1 = v18
    v15 = v52
    let v53: s3 = v26.p0
    var v44: Double = v52
    let v79: s3 = f52(v53)
    let v189: s3 = f33(v79)
    let v99: s4 = s4(p0: v189, p1: v44)
    let v135: Double = v99.p1
    return v135
  }
  func benchmark() {
    let v0: s13 = s13(p0: s7(p0: s5(p0: [s0(p0: [[0.0], [1.0]], p1: 2.0)], p1: [s2(p0: s1(p0: [[s0(p0: [[3.0], [4.0]], p1: 5.0)]], p1: [s0(p0: [[6.0], [7.0]], p1: 8.0), s0(p0: [[9.0], [10.0]], p1: 11.0), s0(p0: [[12.0], [13.0]], p1: 14.0)]), p1: [s0(p0: [[15.0], [16.0]], p1: 17.0), s0(p0: [[18.0], [19.0]], p1: 20.0), s0(p0: [[21.0], [22.0]], p1: 23.0)])]), p1: [s4(p0: s3(p0: [s0(p0: [[24.0], [25.0]], p1: 26.0), s0(p0: [[27.0], [28.0]], p1: 29.0), s0(p0: [[30.0], [31.0]], p1: 32.0)], p1: [s0(p0: [[33.0], [34.0]], p1: 35.0), s0(p0: [[36.0], [37.0]], p1: 38.0)]), p1: 39.0), s4(p0: s3(p0: [s0(p0: [[40.0], [41.0]], p1: 42.0), s0(p0: [[43.0], [44.0]], p1: 45.0), s0(p0: [[46.0], [47.0]], p1: 48.0)], p1: [s0(p0: [[49.0], [50.0]], p1: 51.0), s0(p0: [[52.0], [53.0]], p1: 54.0)]), p1: 55.0), s4(p0: s3(p0: [s0(p0: [[56.0], [57.0]], p1: 58.0), s0(p0: [[59.0], [60.0]], p1: 61.0), s0(p0: [[62.0], [63.0]], p1: 64.0)], p1: [s0(p0: [[65.0], [66.0]], p1: 67.0), s0(p0: [[68.0], [69.0]], p1: 70.0)]), p1: 71.0)]), p1: s0(p0: [[72.0], [73.0]], p1: 74.0))
    let v1: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
