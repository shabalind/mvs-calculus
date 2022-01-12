  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
    var p2: s0
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  func f34(_ v0: s3) -> s3 {
    var v6: s3 = v0
    var v7: s3 = v0
    var v3: s3 = v0
    var v2: s3 = v6
    let v4: s0 = v7.p0
    let v1: [s3] = [v3, v6, v0, v2, v0, v3]
    v2.p1 = v4
    v2.p1 = v4
    v7.p0 = v4
    let v9: s0 = v6.p1
    let v18: s0 = v7.p1
    let v17: s0 = v2.p0
    v6.p1 = v17
    var v33: s3 = v6
    var v12: s3 = v33
    v2.p1 = v17
    let v20: s3 = v1[4]
    v7.p1 = v4
    v2.p0 = v17
    v3.p0 = v18
    v2.p0 = v9
    let v22: s0 = v12.p0
    var v45: s3 = v20
    v6.p1 = v4
    v7.p0 = v4
    v33.p0 = v18
    v45.p1 = v22
    return v45
  }
  func f33(_ v0: s1) -> s1 {
    let v5: [s0] = v0.p0
    var v7: s1 = v0
    let v3: [s0] = v7.p0
    var v2: [s0] = v5
    let v8: s0 = v5[1]
    let v10: s0 = v3[2]
    var v1: s0 = v8
    let v4: [s0] = v0.p0
    v7.p1 = v1
    let v12: [[Double]] = v1.p0
    v2[0] = v10
    var v17: s1 = v7
    let v9: s0 = v4[2]
    v2[2] = v10
    v17.p0 = v2
    var v6: [[Double]] = v12
    v17.p1 = v1
    v1.p0 = v6
    let v14: s2 = s2(p0: v17, p1: v10, p2: v8)
    let v16: [[Double]] = v1.p0
    let v25: s0 = v4[1]
    v2[1] = v8
    v1.p0 = v16
    v17.p1 = v25
    let v26: s0 = v14.p2
    v7.p1 = v9
    v17 = v7
    v7.p0 = v3
    v2[0] = v26
    v17.p1 = v8
    v7.p1 = v1
    var v29: s1 = v17
    return v29
  }
  func f24(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v0
    var v3: Double = v4
    var v7: Double = v4
    var v6: Double = v2
    let v8: [Double] = [v0, v4, v2, v4, v7]
    var v11: [Double] = v8
    var v10: Double = v6
    let v9: Double = v11[1]
    var v12: [Double] = v8
    let v22: Double = v12[4]
    v4 = v22
    let v13: [[Double]] = [v8, v12, v11, v8, v8, v11, v11]
    v12[3] = v7
    v11[3] = v2
    let v17: Double = v12[3]
    v11[2] = v7
    let v35: Double = v12[1]
    v11[2] = v10
    var v20: [[Double]] = v13
    v12[0] = v17
    v7 = v17
    v4 = v3
    v12[2] = v35
    v20 = v13
    var v14: [[Double]] = v20
    let v27: [Double] = v14[0]
    let v56: Double = v27[2]
    v4 = v0
    v12[3] = v9
    return v56
  }
  func f22(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v3: [[Double]] = v5
    let v7: [[Double]] = v0.p0
    let v1: [Double] = v7[0]
    let v9: Double = v1[0]
    let v10: s0 = s0(p0: v3, p1: v9)
    var v11: [Double] = v1
    v3 = v7
    let v14: Double = v1[0]
    let v17: [Double] = v7[0]
    var v8: s0 = v0
    var v25: Double = v14
    let v18: Double = v1[0]
    v25 = v18
    let v13: [[Double]] = v0.p0
    let v19: Double = v17[0]
    v8.p1 = v25
    v8 = v10
    let v23: Double = v1[0]
    v8.p1 = v23
    var v28: s0 = v0
    v8 = v10
    var v48: [[Double]] = v13
    v48[0] = v17
    let v30: Double = v11[0]
    v28.p1 = v19
    var v33: s0 = v10
    v8.p1 = v30
    v33.p1 = v23
    v33.p0 = v7
    v8.p0 = v5
    v48[0] = v17
    var v50: s0 = v33
    var v43: s0 = v50
    let v60: Double = v28.p1
    let v74: s3 = s3(p0: v0, p1: v43)
    var v37: s3 = v74
    var v71: s3 = v37
    v50.p0 = v48
    let v81: s3 = f34(v74)
    v8.p0 = v3
    v8.p1 = v60
    let v59: s0 = v81.p1
    let v132: s3 = f34(v74)
    let v85: s0 = v74.p1
    let v96: s0 = v71.p0
    let v148: [[Double]] = v8.p0
    v37.p1 = v59
    v33 = v8
    let v94: [[Double]] = v85.p0
    v71 = v132
    v37.p1 = v33
    v43.p0 = v148
    v8.p0 = v94
    v8.p0 = v148
    return v96
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: [s2], _ v2: [s1], _ v3: Double) -> Double {
    var v8: [s2] = v0
    let v4: s2 = v8[0]
    let v9: s0 = v4.p2
    v8[0] = v4
    var v14: s2 = v4
    let v7: [[Double]] = v9.p0
    v14.p2 = v9
    let v5: s0 = f22(v9)
    v8[1] = v4
    v14.p2 = v5
    let v13: s0 = v14.p1
    v8[0] = v14
    let v10: Double = f24(v3)
    let v6: Double = v13.p1
    let v16: s1 = v2[0]
    let v11: s1 = f33(v16)
    let v28: s2 = v1[0]
    v14.p0 = v11
    v8[1] = v28
    var v37: s0 = v9
    var v70: Double = v10
    v37.p0 = v7
    let v42: Double = v70 * v6
    let v45: Double = v37.p1
    v70 = v45
    return v42
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: [s0(p0: [[0.0]], p1: 1.0), s0(p0: [[2.0]], p1: 3.0), s0(p0: [[4.0]], p1: 5.0)], p1: s0(p0: [[6.0]], p1: 7.0)), p1: s0(p0: [[8.0]], p1: 9.0), p2: s0(p0: [[10.0]], p1: 11.0)), s2(p0: s1(p0: [s0(p0: [[12.0]], p1: 13.0), s0(p0: [[14.0]], p1: 15.0), s0(p0: [[16.0]], p1: 17.0)], p1: s0(p0: [[18.0]], p1: 19.0)), p1: s0(p0: [[20.0]], p1: 21.0), p2: s0(p0: [[22.0]], p1: 23.0))]
    let v1: [s2] = [s2(p0: s1(p0: [s0(p0: [[24.0]], p1: 25.0), s0(p0: [[26.0]], p1: 27.0), s0(p0: [[28.0]], p1: 29.0)], p1: s0(p0: [[30.0]], p1: 31.0)), p1: s0(p0: [[32.0]], p1: 33.0), p2: s0(p0: [[34.0]], p1: 35.0))]
    let v2: [s1] = [s1(p0: [s0(p0: [[36.0]], p1: 37.0), s0(p0: [[38.0]], p1: 39.0), s0(p0: [[40.0]], p1: 41.0)], p1: s0(p0: [[42.0]], p1: 43.0)), s1(p0: [s0(p0: [[44.0]], p1: 45.0), s0(p0: [[46.0]], p1: 47.0), s0(p0: [[48.0]], p1: 49.0)], p1: s0(p0: [[50.0]], p1: 51.0)), s1(p0: [s0(p0: [[52.0]], p1: 53.0), s0(p0: [[54.0]], p1: 55.0), s0(p0: [[56.0]], p1: 57.0)], p1: s0(p0: [[58.0]], p1: 59.0))]
    let v3: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
