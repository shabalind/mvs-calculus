  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  func f37(_ v0: [Double]) -> [Double] {
    var v6: [Double] = v0
    let v4: Double = v6[0]
    v6[0] = v4
    var v1: Double = v4
    v6[0] = v1
    var v3: Double = v1
    let v8: [Double] = [v4, v3, v1, v4, v4, v3, v4]
    var v7: [Double] = v0
    let v12: Double = v8[4]
    let v5: Double = v0[0]
    v6[0] = v12
    var v9: Double = v12
    v7[0] = v1
    v6[0] = v9
    let v53: [[Double]] = [v0, v0, v7, v7, v6, v7, v6]
    let v67: [Double] = v53[3]
    let v34: Double = v8[4]
    let v68: [Double] = v53[5]
    let v72: Double = v68[0]
    var v52: [Double] = v67
    v7[0] = v34
    v6[0] = v5
    v52[0] = v72
    return v52
  }
  func f32(_ v0: s2, _ v1: s0) -> s2 {
    let v7: s0 = v0.p0
    var v3: s2 = v0
    v3.p1 = v7
    let v4: [s2] = [v0, v3, v3]
    v3.p1 = v7
    v3.p1 = v1
    let v8: s0 = v3.p1
    let v2: s2 = v4[0]
    let v13: [s2] = [v2]
    var v22: [s2] = v13
    v3.p1 = v8
    let v23: s0 = v0.p1
    v3.p0 = v7
    v3.p1 = v23
    let v45: s2 = v22[0]
    var v89: [s2] = v13
    let v53: s2 = v89[0]
    v89[0] = v2
    v89[0] = v45
    v89[0] = v3
    v22 = v13
    v22 = v89
    return v53
  }
  func f28(_ v0: s0) -> s0 {
    var v6: s0 = v0
    var v3: s0 = v6
    var v5: s0 = v3
    let v7: [[Double]] = v3.p0
    var v8: [[Double]] = v7
    let v1: [[Double]] = v0.p0
    let v12: [Double] = v7[1]
    var v2: [Double] = v12
    let v18: [[Double]] = v6.p1
    let v9: [Double] = v8[0]
    let v21: [Double] = f37(v2)
    v8[1] = v9
    let v25: [Double] = v18[0]
    v3.p1 = v18
    v8[0] = v21
    var v10: [Double] = v25
    let v20: s2 = s2(p0: v5, p1: v6)
    let v19: s2 = f32(v20, v6)
    v5.p0 = v1
    var v22: [[Double]] = v1
    v22[0] = v21
    let v55: [[Double]] = v5.p1
    var v44: s2 = v20
    v3.p1 = v18
    v22 = v8
    v3.p0 = v1
    let v62: [Double] = v55[2]
    v8[0] = v62
    v8[0] = v10
    let v69: Double = v62[0]
    let v80: s2 = f32(v19, v3)
    var v72: s2 = v44
    let v42: s0 = v72.p0
    v8[0] = v25
    v3.p0 = v22
    let v52: s2 = f32(v80, v42)
    v44.p1 = v0
    v6.p0 = v8
    let v81: s2 = f32(v52, v3)
    v2[0] = v69
    let v154: s0 = v81.p0
    v8[1] = v62
    return v154
  }
  func f15(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v6: [[Double]] = v0.p1
    v2.p1 = v6
    return v2
  }
  func f8(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v7: s0 = v1
    let v8: s0 = f15(v7)
    let v2: [[Double]] = v0.p1
    let v5: [[Double]] = v7.p1
    let v9: [[Double]] = v1.p1
    let v10: [Double] = v5[2]
    let v4: [[Double]] = v7.p0
    v7.p0 = v4
    let v3: [Double] = v9[0]
    var v6: [[Double]] = v4
    let v23: s0 = f28(v0)
    let v24: [Double] = v2[2]
    let v16: [Double] = f37(v3)
    let v17: s0 = f15(v0)
    v6[1] = v16
    let v15: s0 = f28(v1)
    let v43: Double = v16[0]
    v7.p1 = v9
    let v18: [Double] = f37(v3)
    let v22: [Double] = v9[0]
    let v29: [[Double]] = v8.p0
    let v27: [Double] = f37(v10)
    let v45: [Double] = f37(v18)
    let v26: s0 = f15(v15)
    let v50: [[Double]] = v17.p1
    let v25: [[Double]] = v26.p0
    let v66: Double = v43 - v43
    let v30: Double = v27[0]
    let v48: [[Double]] = v17.p1
    var v41: Double = v30
    let v58: Double = v24[0]
    var v34: [Double] = v22
    let v67: [[Double]] = v15.p1
    v34[0] = v30
    let v83: [Double] = f37(v10)
    let v51: [[Double]] = v23.p0
    v1.p1 = v50
    v6[0] = v34
    let v126: Double = v58 * v66
    v34[0] = v126
    v34[0] = v41
    v1.p0 = v51
    let v76: Double = v10[0]
    var v131: [[Double]] = v48
    let v138: s0 = s0(p0: v25, p1: v131)
    v131[2] = v45
    v34[0] = v76
    v7.p0 = v6
    v131[2] = v83
    v7.p1 = v2
    v7.p0 = v29
    let v120: s0 = f28(v138)
    v7.p1 = v67
    return v120
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s3, _ v2: Double) -> Double {
    let v4: s0 = v1.p1
    let v9: Double = v2 + v2
    let v15: [[Double]] = v4.p0
    let v12: Double = v9 + v2
    var v13: s0 = v4
    v13.p0 = v15
    let v10: s0 = f15(v13)
    let v27: s0 = f8(v10)
    var v21: Double = v12
    v13.p0 = v15
    let v42: [[Double]] = v27.p0
    let v55: [Double] = v42[1]
    v13 = v4
    let v53: Double = v55[0]
    let v50: Double = v21 * v53
    v13.p0 = v42
    return v50
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), s2(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))]
    let v1: s3 = s3(p0: [s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]), s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: [s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])])], p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]))
    let v2: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
