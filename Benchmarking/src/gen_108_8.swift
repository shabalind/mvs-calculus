  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
    var p2: s2
  }
  struct s5 {
    var p0: Double
    var p1: s3
  }
  struct s6 {
    var p0: s3
    var p1: s0
    var p2: [s3]
    var p3: [s0]
    var p4: [s3]
  }
  struct s8 {
    var p0: [s0]
    var p1: Double
  }
  struct s10 {
    var p0: s1
    var p1: s3
  }
  struct s12 {
    var p0: [s8]
    var p1: [s6]
  }
  func f25(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v5: s0 = v0.p1
    v7.p1 = v5
    let v40: s0 = v0.p1
    let v17: s0 = v7.p0
    var v21: s1 = v7
    let v30: s0 = v7.p1
    v7.p0 = v5
    v7.p1 = v17
    let v68: s1 = s1(p0: v17, p1: v40)
    var v67: s1 = v68
    var v81: s1 = v67
    let v119: s0 = v0.p0
    let v64: s0 = v67.p1
    var v60: s1 = v21
    v67.p1 = v30
    v67.p0 = v64
    v81.p1 = v119
    v60 = v81
    return v60
  }
  func f24(_ v0: s6, _ v1: s3) -> s3 {
    var v7: s3 = v1
    let v2: [s1] = v7.p0
    var v14: s3 = v7
    v7 = v14
    v14.p0 = v2
    v7.p0 = v2
    v14.p0 = v2
    let v20: s1 = v2[0]
    let v24: s2 = v14.p2
    v7.p1 = v24
    v7.p1 = v24
    v7 = v1
    let v38: s1 = f25(v20)
    var v39: [s1] = v2
    let v82: s3 = s3(p0: v39, p1: v24, p2: v24)
    v39[0] = v38
    v7.p0 = v2
    return v82
  }
  func f15(_ v0: s6) -> s6 {
    return v0
  }
  func f14(_ v0: s3) -> s3 {
    let v2: s2 = v0.p2
    let v3: s0 = v2.p1
    let v5: [s0] = v2.p0
    var v6: s3 = v0
    let v1: [s0] = v2.p0
    let v7: s0 = v5[0]
    let v8: s0 = v1[0]
    let v9: s0 = v5[0]
    v6.p2 = v2
    var v27: [s0] = v1
    let v13: s0 = v27[0]
    var v18: s0 = v13
    let v36: s0 = v2.p1
    var v30: s2 = v2
    let v21: s2 = v0.p1
    v30.p0 = v1
    let v10: s0 = v5[0]
    v27[0] = v13
    let v41: s0 = v1[0]
    v27[0] = v7
    var v12: s2 = v30
    v12.p1 = v13
    v18 = v10
    v30.p1 = v10
    var v24: s3 = v6
    let v28: s0 = v27[0]
    var v17: s0 = v18
    var v55: [s0] = v5
    let v44: s0 = v5[0]
    v24.p1 = v2
    var v76: [s0] = v27
    v76[0] = v10
    v55[0] = v28
    var v98: [s0] = v76
    let v48: s0 = v98[0]
    v76[0] = v41
    let v38: [[Double]] = v17.p0
    v27[0] = v44
    let v80: [s0] = [v17, v17]
    v98[0] = v28
    let v40: [Double] = v38[0]
    let v39: Double = v40[0]
    v18 = v28
    v27[0] = v36
    v24.p2 = v21
    v18 = v8
    v18.p0 = v38
    var v32: s2 = v12
    let v29: s0 = v80[0]
    let v51: Double = v48.p1
    let v54: Double = v39 / v51
    v27 = v55
    v6.p2 = v32
    v98[0] = v29
    v18.p1 = v54
    v30.p0 = v76
    let v99: s2 = v24.p1
    v55[0] = v9
    v98[0] = v3
    v18.p0 = v38
    let v74: [[Double]] = v9.p0
    v30.p0 = v27
    v98[0] = v18
    let v68: s5 = s5(p0: v54, p1: v24)
    var v71: s5 = v68
    let v90: s0 = v80[1]
    v17.p0 = v74
    v55[0] = v10
    v6.p2 = v99
    v24.p1 = v2
    let v119: s3 = v71.p1
    v76[0] = v90
    return v119
  }
  func f13(_ v0: [s6], _ v1: [[s10]], _ v2: s0) -> s0 {
    let v3: [[Double]] = v2.p0
    let v10: s6 = v0[0]
    let v9: s6 = f15(v10)
    let v12: s3 = v9.p0
    var v13: s3 = v12
    let v18: s3 = f24(v10, v13)
    let v19: [Double] = v3[0]
    let v11: s2 = v13.p2
    let v16: [s1] = v12.p0
    let v21: s6 = f15(v10)
    let v32: s1 = v16[0]
    let v44: Double = v19[0]
    let v53: [s2] = [v11, v11, v11, v11, v11, v11]
    v13.p1 = v11
    var v33: s1 = v32
    let v28: s3 = f14(v18)
    var v27: s2 = v11
    let v34: s2 = v53[1]
    let v61: s2 = v53[1]
    let v56: s0 = v33.p0
    v27.p1 = v56
    let v78: [[Double]] = v56.p0
    let v48: [s0] = v27.p0
    v13.p1 = v34
    let v96: [s1] = v28.p0
    v13.p2 = v34
    let v91: s0 = v21.p1
    v33.p0 = v91
    let v86: s0 = v48[0]
    var v88: s0 = v56
    v88.p0 = v78
    v27.p0 = v48
    v13.p2 = v61
    v88.p1 = v44
    v33.p1 = v88
    v13.p0 = v96
    return v86
  }
  func f7(_ v0: s0) -> s0 {
    let v4: Double = v0.p1
    let v5: Double = v4 * v4
    var v7: Double = v4
    let v6: s1 = s1(p0: v0, p1: v0)
    let v1: s1 = f25(v6)
    let v8: s0 = v1.p0
    var v13: Double = v5
    let v2: s1 = f25(v6)
    let v14: s0 = v2.p1
    let v36: [Double] = [v4, v13, v7, v4, v4, v7]
    var v16: [Double] = v36
    let v21: Double = v16[5]
    v16[0] = v5
    var v40: Double = v4
    v16[3] = v5
    let v24: Double = v16[3]
    var v26: Double = v40
    var v30: Double = v24
    var v27: [Double] = v16
    var v35: s0 = v8
    v27[0] = v26
    let v32: Double = v27[1]
    v16[3] = v7
    let v50: Double = v14.p1
    v35.p1 = v30
    v27[1] = v32
    v35.p1 = v32
    v35.p1 = v21
    v35.p1 = v50
    return v35
  }
  @inline(never)
  func f0(_ v0: [[s10]], _ v1: s1, _ v2: s5, _ v3: s12, _ v4: [[s1]], _ v5: Double) -> Double {
    let v11: [s1] = v4[0]
    let v9: s1 = f25(v1)
    let v8: [s6] = v3.p1
    let v21: s0 = v9.p0
    let v15: s0 = f13(v8, v0, v21)
    let v29: s0 = f7(v15)
    let v20: s1 = v11[0]
    let v39: Double = v29.p1
    let v37: s0 = v20.p0
    let v88: Double = v37.p1
    let v54: Double = v39 * v88
    return v54
  }
  func benchmark() {
    let v0: [[s10]] = [[s10(p0: s1(p0: s0(p0: [[0.0]], p1: 1.0), p1: s0(p0: [[2.0]], p1: 3.0)), p1: s3(p0: [s1(p0: s0(p0: [[4.0]], p1: 5.0), p1: s0(p0: [[6.0]], p1: 7.0))], p1: s2(p0: [s0(p0: [[8.0]], p1: 9.0)], p1: s0(p0: [[10.0]], p1: 11.0)), p2: s2(p0: [s0(p0: [[12.0]], p1: 13.0)], p1: s0(p0: [[14.0]], p1: 15.0))))]]
    let v1: s1 = s1(p0: s0(p0: [[16.0]], p1: 17.0), p1: s0(p0: [[18.0]], p1: 19.0))
    let v2: s5 = s5(p0: 20.0, p1: s3(p0: [s1(p0: s0(p0: [[21.0]], p1: 22.0), p1: s0(p0: [[23.0]], p1: 24.0))], p1: s2(p0: [s0(p0: [[25.0]], p1: 26.0)], p1: s0(p0: [[27.0]], p1: 28.0)), p2: s2(p0: [s0(p0: [[29.0]], p1: 30.0)], p1: s0(p0: [[31.0]], p1: 32.0))))
    let v3: s12 = s12(p0: [s8(p0: [s0(p0: [[33.0]], p1: 34.0)], p1: 35.0), s8(p0: [s0(p0: [[36.0]], p1: 37.0)], p1: 38.0)], p1: [s6(p0: s3(p0: [s1(p0: s0(p0: [[39.0]], p1: 40.0), p1: s0(p0: [[41.0]], p1: 42.0))], p1: s2(p0: [s0(p0: [[43.0]], p1: 44.0)], p1: s0(p0: [[45.0]], p1: 46.0)), p2: s2(p0: [s0(p0: [[47.0]], p1: 48.0)], p1: s0(p0: [[49.0]], p1: 50.0))), p1: s0(p0: [[51.0]], p1: 52.0), p2: [s3(p0: [s1(p0: s0(p0: [[53.0]], p1: 54.0), p1: s0(p0: [[55.0]], p1: 56.0))], p1: s2(p0: [s0(p0: [[57.0]], p1: 58.0)], p1: s0(p0: [[59.0]], p1: 60.0)), p2: s2(p0: [s0(p0: [[61.0]], p1: 62.0)], p1: s0(p0: [[63.0]], p1: 64.0))), s3(p0: [s1(p0: s0(p0: [[65.0]], p1: 66.0), p1: s0(p0: [[67.0]], p1: 68.0))], p1: s2(p0: [s0(p0: [[69.0]], p1: 70.0)], p1: s0(p0: [[71.0]], p1: 72.0)), p2: s2(p0: [s0(p0: [[73.0]], p1: 74.0)], p1: s0(p0: [[75.0]], p1: 76.0)))], p3: [s0(p0: [[77.0]], p1: 78.0), s0(p0: [[79.0]], p1: 80.0)], p4: [s3(p0: [s1(p0: s0(p0: [[81.0]], p1: 82.0), p1: s0(p0: [[83.0]], p1: 84.0))], p1: s2(p0: [s0(p0: [[85.0]], p1: 86.0)], p1: s0(p0: [[87.0]], p1: 88.0)), p2: s2(p0: [s0(p0: [[89.0]], p1: 90.0)], p1: s0(p0: [[91.0]], p1: 92.0))), s3(p0: [s1(p0: s0(p0: [[93.0]], p1: 94.0), p1: s0(p0: [[95.0]], p1: 96.0))], p1: s2(p0: [s0(p0: [[97.0]], p1: 98.0)], p1: s0(p0: [[99.0]], p1: 100.0)), p2: s2(p0: [s0(p0: [[101.0]], p1: 102.0)], p1: s0(p0: [[103.0]], p1: 104.0))), s3(p0: [s1(p0: s0(p0: [[105.0]], p1: 106.0), p1: s0(p0: [[107.0]], p1: 108.0))], p1: s2(p0: [s0(p0: [[109.0]], p1: 110.0)], p1: s0(p0: [[111.0]], p1: 112.0)), p2: s2(p0: [s0(p0: [[113.0]], p1: 114.0)], p1: s0(p0: [[115.0]], p1: 116.0)))]), s6(p0: s3(p0: [s1(p0: s0(p0: [[117.0]], p1: 118.0), p1: s0(p0: [[119.0]], p1: 120.0))], p1: s2(p0: [s0(p0: [[121.0]], p1: 122.0)], p1: s0(p0: [[123.0]], p1: 124.0)), p2: s2(p0: [s0(p0: [[125.0]], p1: 126.0)], p1: s0(p0: [[127.0]], p1: 128.0))), p1: s0(p0: [[129.0]], p1: 130.0), p2: [s3(p0: [s1(p0: s0(p0: [[131.0]], p1: 132.0), p1: s0(p0: [[133.0]], p1: 134.0))], p1: s2(p0: [s0(p0: [[135.0]], p1: 136.0)], p1: s0(p0: [[137.0]], p1: 138.0)), p2: s2(p0: [s0(p0: [[139.0]], p1: 140.0)], p1: s0(p0: [[141.0]], p1: 142.0))), s3(p0: [s1(p0: s0(p0: [[143.0]], p1: 144.0), p1: s0(p0: [[145.0]], p1: 146.0))], p1: s2(p0: [s0(p0: [[147.0]], p1: 148.0)], p1: s0(p0: [[149.0]], p1: 150.0)), p2: s2(p0: [s0(p0: [[151.0]], p1: 152.0)], p1: s0(p0: [[153.0]], p1: 154.0)))], p3: [s0(p0: [[155.0]], p1: 156.0), s0(p0: [[157.0]], p1: 158.0)], p4: [s3(p0: [s1(p0: s0(p0: [[159.0]], p1: 160.0), p1: s0(p0: [[161.0]], p1: 162.0))], p1: s2(p0: [s0(p0: [[163.0]], p1: 164.0)], p1: s0(p0: [[165.0]], p1: 166.0)), p2: s2(p0: [s0(p0: [[167.0]], p1: 168.0)], p1: s0(p0: [[169.0]], p1: 170.0))), s3(p0: [s1(p0: s0(p0: [[171.0]], p1: 172.0), p1: s0(p0: [[173.0]], p1: 174.0))], p1: s2(p0: [s0(p0: [[175.0]], p1: 176.0)], p1: s0(p0: [[177.0]], p1: 178.0)), p2: s2(p0: [s0(p0: [[179.0]], p1: 180.0)], p1: s0(p0: [[181.0]], p1: 182.0))), s3(p0: [s1(p0: s0(p0: [[183.0]], p1: 184.0), p1: s0(p0: [[185.0]], p1: 186.0))], p1: s2(p0: [s0(p0: [[187.0]], p1: 188.0)], p1: s0(p0: [[189.0]], p1: 190.0)), p2: s2(p0: [s0(p0: [[191.0]], p1: 192.0)], p1: s0(p0: [[193.0]], p1: 194.0)))])])
    let v4: [[s1]] = [[s1(p0: s0(p0: [[195.0]], p1: 196.0), p1: s0(p0: [[197.0]], p1: 198.0))], [s1(p0: s0(p0: [[199.0]], p1: 200.0), p1: s0(p0: [[201.0]], p1: 202.0))], [s1(p0: s0(p0: [[203.0]], p1: 204.0), p1: s0(p0: [[205.0]], p1: 206.0))]]
    let v5: Double = 207.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 207.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
