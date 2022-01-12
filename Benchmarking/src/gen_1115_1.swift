  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: Double
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s1
  }
  func f61(_ v0: s1) -> s1 {
    let v7: [s0] = v0.p1
    let v2: s0 = v7[0]
    let v6: [[Double]] = v2.p0
    let v22: [Double] = v6[1]
    let v10: [s0] = v0.p1
    var v29: [Double] = v22
    let v19: Double = v0.p0
    let v17: Double = v29[0]
    var v24: s1 = v0
    let v26: Double = v19 / v17
    v24.p0 = v26
    v24.p1 = v10
    return v24
  }
  func f60(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v6: s0 = v0
    let v3: [[Double]] = v4.p0
    let v11: [Double] = v4.p1
    let v19: [Double] = v3[1]
    let v2: Double = v11[1]
    let v22: Double = v11[0]
    let v14: [[Double]] = v0.p0
    let v24: [[Double]] = v6.p0
    v4.p1 = v11
    let v15: s0 = s0(p0: v24, p1: v11)
    let v23: [Double] = v6.p1
    let v16: s0 = s0(p0: v14, p1: v23)
    var v29: [[Double]] = v24
    let v17: [Double] = v6.p1
    let v28: [[Double]] = v6.p0
    let v36: [Double] = v28[1]
    var v25: s0 = v16
    v6.p1 = v23
    let v61: [Double] = v29[1]
    let v31: Double = v61[0]
    var v45: s0 = v25
    var v87: [Double] = v11
    v45.p1 = v17
    v29[1] = v36
    let v122: Double = v19[0]
    let v92: Double = v122 * v22
    v87[1] = v92
    let v125: [[Double]] = v4.p0
    v45.p1 = v87
    v6.p0 = v125
    let v255: [Double] = [v2, v31]
    let v186: [s0] = [v45, v4, v6]
    v25 = v15
    v25.p1 = v255
    let v98: s0 = v186[0]
    return v98
  }
  func f52(_ v0: s1, _ v1: s1, _ v2: s1) -> s1 {
    let v3: s3 = s3(p0: v0)
    let v5: s1 = v3.p0
    let v8: Double = v1.p0
    var v15: Double = v8
    var v4: s1 = v5
    v4.p0 = v15
    let v13: s1 = v3.p0
    let v9: s1 = f61(v13)
    v4 = v9
    v4.p0 = v8
    return v4
  }
  func f48(_ v0: s1) -> s1 {
    var v3: s1 = v0
    var v1: s1 = v3
    var v5: s1 = v3
    var v4: s1 = v0
    var v10: s1 = v3
    let v7: s1 = f61(v1)
    var v8: s1 = v7
    let v11: Double = v5.p0
    let v13: Double = v1.p0
    var v9: s1 = v10
    var v2: Double = v13
    let v23: [s0] = v7.p1
    let v18: s1 = f52(v9, v10, v10)
    let v22: s0 = v23[0]
    var v16: [s0] = v23
    var v29: s1 = v18
    v16[0] = v22
    v3.p0 = v11
    let v21: [s0] = v29.p1
    let v31: s1 = f61(v4)
    var v73: Double = v2
    let v25: s0 = v23[0]
    v16[0] = v22
    let v20: s0 = v23[0]
    let v24: [Double] = v20.p1
    let v33: [Double] = v22.p1
    let v71: s0 = f60(v22)
    let v61: [[Double]] = v25.p0
    v9.p1 = v16
    let v32: s0 = v23[0]
    v5.p0 = v13
    let v45: s0 = s0(p0: v61, p1: v24)
    let v50: s1 = s1(p0: v73, p1: v16)
    v16[0] = v32
    let v38: Double = v33[0]
    v1.p1 = v21
    let v169: [s0] = v8.p1
    v16[0] = v45
    v16[0] = v45
    v5.p1 = v23
    v16[0] = v32
    let v117: Double = v31.p0
    v3.p1 = v169
    v9.p0 = v117
    let v48: Double = v31.p0
    v3.p1 = v16
    v29.p1 = v23
    v16[0] = v71
    v29.p0 = v38
    v2 = v48
    v10.p0 = v38
    return v50
  }
  func f46(_ v0: s1) -> s1 {
    var v1: s1 = v0
    var v3: s1 = v1
    var v6: s1 = v1
    let v7: [s0] = v1.p1
    var v5: [s0] = v7
    let v2: s0 = v7[0]
    var v12: s0 = v2
    var v10: s0 = v12
    let v9: [Double] = v12.p1
    let v13: s3 = s3(p0: v0)
    var v17: [s0] = v7
    var v4: s1 = v0
    v1.p1 = v5
    var v16: s0 = v10
    v16.p1 = v9
    let v14: [[Double]] = v12.p0
    let v18: s3 = s3(p0: v6)
    let v15: s1 = f52(v0, v3, v4)
    v3.p1 = v17
    v5[0] = v10
    let v29: [[Double]] = v16.p0
    let v32: s1 = f52(v15, v0, v4)
    v5[0] = v16
    let v25: s1 = v18.p0
    v17[0] = v16
    v5[0] = v12
    v12.p0 = v29
    v1.p1 = v5
    v16.p0 = v14
    let v22: [Double] = v2.p1
    let v72: s1 = f52(v0, v3, v6)
    v3.p1 = v17
    v17[0] = v10
    let v36: s1 = v13.p0
    let v62: s1 = f52(v36, v3, v1)
    let v93: s3 = s3(p0: v0)
    let v56: s1 = v93.p0
    let v79: s0 = f60(v16)
    v17[0] = v79
    let v77: s1 = f48(v62)
    let v44: s0 = v5[0]
    v12.p1 = v22
    let v50: [s1] = [v25, v32, v0, v77]
    v4 = v56
    let v159: s0 = s0(p0: v29, p1: v9)
    let v91: [s0] = v62.p1
    v16.p0 = v29
    v17[0] = v44
    let v84: s1 = v50[0]
    v1.p1 = v91
    let v297: s1 = f52(v72, v84, v77)
    var v95: s0 = v159
    v12 = v95
    let v123: s1 = f61(v297)
    return v123
  }
  func f43(_ v0: s1) -> s1 {
    var v3: s1 = v0
    let v2: [s0] = v3.p1
    let v6: [s0] = v0.p1
    let v8: s1 = f61(v3)
    let v1: s0 = v2[0]
    let v7: s1 = f61(v0)
    var v5: s1 = v0
    let v17: s1 = f46(v8)
    v3.p1 = v6
    var v9: [s0] = v2
    v5.p1 = v9
    let v15: s1 = f52(v7, v3, v0)
    v9[0] = v1
    let v10: Double = v7.p0
    let v11: Double = v5.p0
    let v19: s1 = f52(v17, v15, v8)
    var v24: s1 = v19
    let v16: s1 = f46(v3)
    var v33: s1 = v16
    v5 = v17
    v5 = v7
    let v23: s1 = f61(v17)
    let v26: [s0] = v3.p1
    let v21: s0 = v6[0]
    v9[0] = v21
    let v49: [Double] = v1.p1
    let v40: s2 = s2(p0: v17, p1: v17)
    var v54: s2 = v40
    v3.p0 = v10
    var v42: [Double] = v49
    let v45: Double = v15.p0
    var v69: Double = v11
    var v80: Double = v10
    let v139: s1 = f52(v8, v24, v23)
    let v41: Double = v8.p0
    var v72: Double = v45
    let v147: s1 = v54.p0
    v3.p1 = v6
    let v51: Double = v42[1]
    v42[0] = v69
    v72 = v69
    let v73: s1 = f52(v33, v24, v139)
    v54.p0 = v8
    v3.p0 = v72
    v42[1] = v80
    var v44: Double = v80
    v69 = v44
    let v90: s1 = f52(v8, v147, v73)
    v9 = v26
    var v105: s1 = v90
    v33.p0 = v51
    let v103: s1 = f46(v105)
    v24.p0 = v41
    return v103
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s1, _ v2: [s3], _ v3: [[s2]], _ v4: Double) -> Double {
    let v18: s1 = f43(v1)
    let v5: Double = v18.p0
    var v21: Double = v5
    let v20: [Double] = [v4, v21, v4, v5, v5, v21]
    let v31: Double = v20[0]
    return v31
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: 0.0, p1: [s0(p0: [[1.0], [2.0]], p1: [3.0, 4.0])]), p1: s1(p0: 5.0, p1: [s0(p0: [[6.0], [7.0]], p1: [8.0, 9.0])])), s2(p0: s1(p0: 10.0, p1: [s0(p0: [[11.0], [12.0]], p1: [13.0, 14.0])]), p1: s1(p0: 15.0, p1: [s0(p0: [[16.0], [17.0]], p1: [18.0, 19.0])])), s2(p0: s1(p0: 20.0, p1: [s0(p0: [[21.0], [22.0]], p1: [23.0, 24.0])]), p1: s1(p0: 25.0, p1: [s0(p0: [[26.0], [27.0]], p1: [28.0, 29.0])]))]
    let v1: s1 = s1(p0: 30.0, p1: [s0(p0: [[31.0], [32.0]], p1: [33.0, 34.0])])
    let v2: [s3] = [s3(p0: s1(p0: 35.0, p1: [s0(p0: [[36.0], [37.0]], p1: [38.0, 39.0])]))]
    let v3: [[s2]] = [[s2(p0: s1(p0: 40.0, p1: [s0(p0: [[41.0], [42.0]], p1: [43.0, 44.0])]), p1: s1(p0: 45.0, p1: [s0(p0: [[46.0], [47.0]], p1: [48.0, 49.0])]))], [s2(p0: s1(p0: 50.0, p1: [s0(p0: [[51.0], [52.0]], p1: [53.0, 54.0])]), p1: s1(p0: 55.0, p1: [s0(p0: [[56.0], [57.0]], p1: [58.0, 59.0])]))]]
    let v4: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
