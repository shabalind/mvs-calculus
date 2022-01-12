  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: Double
  }
  struct s2 {
    var p0: [s1]
    var p1: [s1]
    var p2: [s1]
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: [[s2]]
  }
  struct s5 {
    var p0: [s3]
    var p1: [s2]
  }
  struct s6 {
    var p0: s5
    var p1: s1
  }
  func f82(_ v0: s2) -> s2 {
    let v7: [s1] = v0.p0
    var v4: [s1] = v7
    let v5: s1 = v4[1]
    var v6: s1 = v5
    let v9: Double = v6.p0
    var v3: Double = v9
    v6.p0 = v9
    v4[1] = v5
    let v10: s1 = v4[1]
    let v2: s1 = v7[0]
    var v18: s2 = v0
    var v1: Double = v3
    v4[1] = v10
    let v13: s1 = v7[1]
    var v8: [s1] = v4
    v18.p1 = v8
    let v17: [s1] = v18.p2
    v4[1] = v13
    var v14: s1 = v5
    var v11: [s1] = v17
    v8[1] = v14
    let v15: [s1] = v18.p2
    v6.p0 = v3
    var v20: s1 = v13
    var v26: Double = v9
    v11[0] = v20
    v4[0] = v13
    var v16: s1 = v14
    let v30: s1 = v11[0]
    v4[0] = v16
    v4[1] = v2
    v16.p0 = v26
    let v21: [Double] = [v1, v1]
    let v22: s1 = v4[0]
    v11[0] = v20
    v6.p0 = v26
    v11[0] = v6
    v11[1] = v30
    var v44: s2 = v18
    v4[1] = v22
    let v49: [s1] = v44.p2
    v14.p0 = v26
    let v38: s2 = s2(p0: v11, p1: v17, p2: v4)
    v18.p1 = v8
    var v39: [Double] = v21
    v6.p0 = v3
    var v32: s2 = v38
    v8[0] = v22
    v39[1] = v3
    v44.p2 = v49
    var v59: s2 = v32
    v4[1] = v5
    v11[0] = v13
    let v78: Double = v39[0]
    let v58: [s1] = v44.p2
    v32.p1 = v15
    let v159: s1 = v58[0]
    v8[0] = v159
    v14.p0 = v78
    return v59
  }
  func f80(_ v0: s2) -> s2 {
    let v6: s2 = f82(v0)
    let v9: s2 = f82(v0)
    let v2: s2 = f82(v6)
    let v5: [s1] = v2.p1
    let v12: s2 = f82(v9)
    var v18: s2 = v12
    v18.p2 = v5
    v18.p1 = v5
    v18 = v12
    let v79: s2 = f82(v18)
    return v79
  }
  func f78(_ v0: [s3]) -> [s3] {
    var v2: [s3] = v0
    let v8: s3 = v2[0]
    var v10: s3 = v8
    v2[0] = v10
    let v23: s0 = v10.p1
    let v18: s0 = v10.p1
    v10.p1 = v18
    let v39: s3 = v0[1]
    v10.p1 = v23
    v2[1] = v39
    var v53: [s3] = v2
    var v55: [s3] = v0
    v2[2] = v10
    v53 = v0
    v2 = v55
    return v53
  }
  func f76(_ v0: s1) -> s1 {
    let v5: Double = v0.p0
    let v6: Double = v0.p0
    let v8: Double = v0.p0
    var v7: Double = v6
    var v16: s1 = v0
    var v13: s1 = v0
    v16 = v13
    v16.p0 = v8
    v16.p0 = v7
    v16.p0 = v5
    return v16
  }
  func f71(_ v0: s1) -> s1 {
    let v3: s1 = f76(v0)
    let v4: s1 = f76(v0)
    var v7: s1 = v0
    let v1: s1 = f76(v3)
    let v12: Double = v0.p0
    let v5: s1 = f76(v3)
    let v8: s1 = f76(v1)
    let v6: [Double] = [v12, v12, v12, v12, v12, v12, v12]
    let v9: Double = v6[3]
    let v10: Double = v8.p0
    v7.p0 = v10
    v7.p0 = v10
    v7.p0 = v10
    v7 = v0
    let v16: Double = v4.p0
    let v11: s1 = f76(v4)
    let v15: Double = v6[1]
    v7.p0 = v15
    v7.p0 = v9
    let v28: s1 = f76(v11)
    let v56: Double = v5.p0
    v7.p0 = v56
    let v78: s1 = f76(v28)
    v7.p0 = v12
    v7.p0 = v16
    let v173: Double = v78.p0
    v7.p0 = v173
    return v7
  }
  func f56(_ v0: s2) -> s2 {
    var v6: s2 = v0
    let v5: [s1] = v0.p0
    let v7: s2 = f80(v6)
    let v8: s2 = f80(v0)
    v6.p2 = v5
    v6.p0 = v5
    v6.p1 = v5
    var v2: s2 = v7
    v6 = v8
    let v23: s2 = f80(v2)
    let v30: s2 = f82(v23)
    return v30
  }
  func f34(_ v0: s5) -> s5 {
    return v0
  }
  func f32(_ v0: s6) -> s6 {
    return v0
  }
  func f25(_ v0: s5) -> s5 {
    var v3: s5 = v0
    let v7: [s2] = v3.p1
    v3.p1 = v7
    let v1: [s3] = v3.p0
    let v2: [s2] = v0.p1
    v3 = v0
    let v5: s5 = f34(v3)
    var v8: s5 = v5
    var v9: s5 = v3
    let v11: [s3] = f78(v1)
    let v6: [s2] = v3.p1
    let v4: [s3] = v5.p0
    let v13: s2 = v6[0]
    let v15: [s5] = [v8, v9, v9, v0]
    v9.p0 = v4
    let v18: s2 = f56(v13)
    let v21: [s2] = v3.p1
    var v69: [s2] = v21
    v69[1] = v18
    v69[0] = v13
    v3.p1 = v69
    let v51: [s3] = v8.p0
    v8.p0 = v51
    v9.p1 = v2
    v8.p0 = v11
    let v65: s5 = v15[2]
    v69 = v2
    return v65
  }
  func f12(_ v0: s6) -> s6 {
    let v3: s1 = v0.p1
    var v4: s6 = v0
    let v10: s6 = f32(v4)
    let v6: s5 = v10.p0
    let v8: s5 = f25(v6)
    v4.p0 = v8
    let v15: s1 = v10.p1
    let v16: s6 = f32(v4)
    v4 = v16
    let v20: s6 = f32(v4)
    v4.p0 = v6
    let v17: s5 = v20.p0
    let v38: s5 = v10.p0
    v4.p0 = v8
    v4.p0 = v17
    let v87: s1 = f71(v15)
    v4.p1 = v3
    var v112: s6 = v0
    v112.p1 = v87
    v112.p0 = v38
    let v125: s5 = f25(v38)
    v112.p1 = v87
    let v123: s5 = f25(v125)
    v112.p0 = v123
    let v209: [s6] = [v112, v16, v112]
    let v76: s6 = v209[2]
    return v76
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: [s4], _ v3: s6, _ v4: s0, _ v5: Double) -> Double {
    let v21: [[Double]] = v1.p1
    let v14: s6 = f12(v3)
    let v25: s1 = v14.p1
    let v27: [Double] = v21[2]
    let v45: Double = v25.p0
    var v37: [Double] = v27
    let v23: Double = v25.p0
    v37[0] = v23
    let v39: Double = v37[0]
    let v146: Double = v39 * v45
    return v146
  }
  func benchmark() {
    let v0: s1 = s1(p0: 0.0)
    let v1: s0 = s0(p0: [[1.0]], p1: [[2.0], [3.0], [4.0]])
    let v2: [s4] = [s4(p0: [[s2(p0: [s1(p0: 5.0), s1(p0: 6.0)], p1: [s1(p0: 7.0), s1(p0: 8.0)], p2: [s1(p0: 9.0), s1(p0: 10.0)])], [s2(p0: [s1(p0: 11.0), s1(p0: 12.0)], p1: [s1(p0: 13.0), s1(p0: 14.0)], p2: [s1(p0: 15.0), s1(p0: 16.0)])], [s2(p0: [s1(p0: 17.0), s1(p0: 18.0)], p1: [s1(p0: 19.0), s1(p0: 20.0)], p2: [s1(p0: 21.0), s1(p0: 22.0)])]])]
    let v3: s6 = s6(p0: s5(p0: [s3(p0: [s1(p0: 23.0), s1(p0: 24.0)], p1: s0(p0: [[25.0]], p1: [[26.0], [27.0], [28.0]])), s3(p0: [s1(p0: 29.0), s1(p0: 30.0)], p1: s0(p0: [[31.0]], p1: [[32.0], [33.0], [34.0]])), s3(p0: [s1(p0: 35.0), s1(p0: 36.0)], p1: s0(p0: [[37.0]], p1: [[38.0], [39.0], [40.0]]))], p1: [s2(p0: [s1(p0: 41.0), s1(p0: 42.0)], p1: [s1(p0: 43.0), s1(p0: 44.0)], p2: [s1(p0: 45.0), s1(p0: 46.0)]), s2(p0: [s1(p0: 47.0), s1(p0: 48.0)], p1: [s1(p0: 49.0), s1(p0: 50.0)], p2: [s1(p0: 51.0), s1(p0: 52.0)])]), p1: s1(p0: 53.0))
    let v4: s0 = s0(p0: [[54.0]], p1: [[55.0], [56.0], [57.0]])
    let v5: Double = 58.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 58.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
