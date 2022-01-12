  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: [[s0]]
    var p3: s0
  }
  func f106(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    var v2: s0 = v0
    v2.p0 = v7
    v2.p0 = v7
    return v2
  }
  func f103(_ v0: [s0], _ v1: s0) -> s0 {
    let v7: [[s0]] = [v0, v0, v0, v0, v0]
    let v5: [s0] = v7[2]
    var v59: [[s0]] = v7
    let v74: [s0] = v59[1]
    v59 = v7
    v59[1] = v5
    let v126: s0 = v74[0]
    return v126
  }
  func f98(_ v0: s0, _ v1: [s0]) -> s0 {
    var v5: s0 = v0
    let v7: s0 = f106(v5)
    let v3: s0 = v1[0]
    var v6: [s0] = v1
    let v11: [[Double]] = v0.p0
    let v9: s0 = v6[0]
    var v15: [[Double]] = v11
    v5.p0 = v15
    v5.p0 = v15
    let v14: s0 = v6[0]
    let v16: [Double] = v11[2]
    let v21: [s0] = [v3, v5, v0, v9, v7, v14, v7]
    v15[1] = v16
    let v25: s0 = v21[3]
    return v25
  }
  func f96(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v2: [[Double]] = v0.p0
    let v4: s0 = f106(v0)
    let v3: [[Double]] = v5.p0
    let v7: [[Double]] = v0.p0
    let v16: s0 = f106(v4)
    let v18: s0 = f106(v4)
    v5.p0 = v7
    let v20: [[Double]] = v16.p1
    let v13: [[Double]] = v18.p1
    v5.p0 = v3
    v5.p1 = v20
    let v14: [[Double]] = v5.p1
    v5.p0 = v2
    let v33: [[Double]] = v5.p1
    v5.p1 = v14
    let v27: s0 = s0(p0: v3, p1: v13)
    v5.p1 = v13
    v5.p1 = v33
    let v108: [[Double]] = v4.p1
    var v40: s0 = v27
    v40.p1 = v108
    var v114: [[Double]] = v20
    v40.p1 = v114
    return v40
  }
  func f93(_ v0: s0) -> s0 {
    let v3: s0 = f106(v0)
    let v1: s0 = f106(v0)
    let v6: [[Double]] = v1.p0
    var v8: [[Double]] = v6
    let v11: [Double] = v6[1]
    let v10: s0 = f106(v3)
    let v12: [[Double]] = v0.p1
    var v26: s0 = v1
    v26.p0 = v8
    v8[0] = v11
    let v14: [[Double]] = v3.p0
    let v22: [[Double]] = v10.p0
    var v24: [[Double]] = v12
    let v19: s0 = f96(v26)
    v26.p0 = v22
    v26.p0 = v6
    v26.p1 = v24
    v26.p0 = v14
    return v19
  }
  func f83(_ v0: s0) -> s0 {
    let v7: s0 = f106(v0)
    let v6: [[Double]] = v0.p1
    var v1: s0 = v7
    v1.p1 = v6
    let v3: s0 = f96(v0)
    let v35: s0 = f96(v0)
    let v14: [[Double]] = v0.p0
    let v31: s0 = f106(v35)
    let v42: [[Double]] = v31.p1
    let v50: s0 = f96(v1)
    v1.p1 = v42
    v1.p0 = v14
    let v129: s0 = f106(v50)
    let v66: [s0] = [v129, v50, v31, v3, v31]
    let v59: s0 = v66[3]
    let v151: s0 = f96(v59)
    return v151
  }
  func f78(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v7: s0 = f83(v0)
    let v4: [s0] = [v0]
    var v2: s0 = v7
    let v9: s0 = f103(v4, v0)
    v2.p0 = v3
    let v5: s0 = f93(v7)
    v2.p0 = v3
    var v17: s0 = v0
    let v14: s0 = v4[0]
    let v18: s0 = f96(v7)
    var v13: [[Double]] = v3
    let v21: s0 = f83(v5)
    v2.p0 = v13
    let v30: [[Double]] = v21.p1
    let v20: [Double] = v13[0]
    let v22: s0 = f83(v17)
    let v25: s0 = f98(v0, v4)
    let v19: [[Double]] = v18.p1
    let v42: s0 = f103(v4, v14)
    let v28: [s0] = [v2, v22, v25, v9]
    v17.p1 = v19
    let v58: [[Double]] = v42.p1
    let v60: [[Double]] = v18.p0
    let v64: s0 = v4[0]
    let v35: [[Double]] = v21.p0
    var v38: [s0] = v28
    v2 = v64
    v2 = v22
    v13[1] = v20
    v17.p0 = v60
    v17.p0 = v35
    let v161: s0 = v38[0]
    v17.p1 = v58
    v2.p1 = v30
    return v161
  }
  func f10(_ v0: s0, _ v1: [s0]) -> s0 {
    let v4: s0 = v1[0]
    let v3: [[Double]] = v4.p1
    let v10: [[Double]] = v0.p0
    var v2: [[Double]] = v10
    var v11: s0 = v4
    let v9: [[Double]] = v11.p1
    let v19: [Double] = v3[1]
    var v20: [[Double]] = v10
    let v17: [[Double]] = v0.p0
    v2[0] = v19
    let v23: [Double] = v17[2]
    let v37: s0 = s0(p0: v10, p1: v9)
    v11.p0 = v2
    v11.p0 = v20
    v11.p0 = v10
    v20[1] = v23
    return v37
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v5: [s0] = v0.p1
    var v8: [s0] = v5
    let v2: s0 = v5[0]
    v8[1] = v2
    let v3: [[Double]] = v2.p1
    let v13: [[Double]] = v2.p0
    var v4: [[Double]] = v13
    let v7: [Double] = v3[1]
    let v12: s0 = s0(p0: v4, p1: v3)
    v4[1] = v7
    v8[0] = v12
    let v22: s0 = f96(v2)
    let v18: s0 = f10(v12, v5)
    let v42: s0 = v8[1]
    v8[0] = v18
    let v41: s0 = f78(v22)
    let v32: [[Double]] = v42.p0
    let v34: [[Double]] = v41.p1
    let v64: [Double] = v32[2]
    let v47: [[Double]] = [v7, v7, v7, v64, v64]
    let v73: [Double] = v47[1]
    var v54: [[Double]] = v47
    let v130: [Double] = v54[2]
    v4[0] = v73
    var v161: [Double] = v130
    let v78: [Double] = v34[1]
    let v144: Double = v161[0]
    v54[0] = v78
    return v144
  }
  func benchmark() {
    let v0: s1 = s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]], p1: [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], p2: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])]], p3: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]]))
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
