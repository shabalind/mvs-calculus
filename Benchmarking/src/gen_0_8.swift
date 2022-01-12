  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  func f108(_ v0: [Double]) -> [Double] {
    let v4: Double = v0[1]
    var v2: Double = v4
    var v7: Double = v2
    var v5: [Double] = v0
    var v11: [Double] = v5
    v5[0] = v4
    let v18: Double = v0[0]
    v11[1] = v4
    let v13: Double = v18 - v4
    let v10: [Double] = [v13, v18]
    var v14: [Double] = v5
    var v22: [Double] = v5
    let v12: [[Double]] = [v14, v11, v11, v5, v14, v5]
    let v20: Double = v10[0]
    let v30: Double = v22[0]
    let v32: [[[Double]]] = [v12, v12, v12, v12, v12]
    var v43: [[[Double]]] = v32
    var v57: Double = v30
    var v58: Double = v57
    v5[0] = v7
    let v40: [[Double]] = v43[0]
    v5[0] = v20
    let v85: [Double] = v40[2]
    v11[1] = v58
    return v85
  }
  func f106(_ v0: Double) -> Double {
    var v7: Double = v0
    var v3: Double = v7
    var v4: Double = v7
    var v6: Double = v0
    var v8: Double = v0
    var v10: Double = v8
    let v11: [Double] = [v6, v3, v4]
    let v5: Double = v11[2]
    let v1: [Double] = f108(v11)
    var v13: [Double] = v1
    let v22: [Double] = f108(v13)
    v4 = v10
    let v64: [Double] = f108(v1)
    v13[1] = v5
    let v20: [Double] = f108(v22)
    let v43: [Double] = f108(v22)
    let v48: [Double] = f108(v11)
    let v31: [Double] = f108(v64)
    var v38: Double = v8
    let v51: Double = v20[0]
    v8 = v38
    let v32: Double = v31[2]
    let v19: Double = v43[2]
    let v34: Double = v1[0]
    v13[1] = v0
    var v97: Double = v10
    let v41: [Double] = f108(v48)
    v8 = v32
    var v140: Double = v10
    let v85: [Double] = [v34, v19, v32, v97, v140, v51, v6]
    var v42: [Double] = v85
    v42 = v85
    let v103: Double = v41[1]
    let v81: Double = v42[4]
    var v87: [Double] = v85
    var v100: [Double] = v87
    v13[2] = v103
    v100[2] = v81
    let v105: Double = v100[5]
    return v105
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v2: Double = f106(v1)
    let v6: [Double] = [v2]
    let v13: Double = f106(v2)
    var v20: Double = v1
    let v10: Double = f106(v13)
    let v14: Double = v10 * v13
    let v21: Double = f106(v20)
    var v15: [Double] = v6
    let v23: Double = f106(v2)
    v15[0] = v21
    v15 = v6
    var v30: Double = v14
    var v59: Double = v10
    v15[0] = v13
    var v40: [Double] = v15
    v20 = v21
    var v192: Double = v10
    var v101: [Double] = v40
    v101[0] = v30
    v40 = v15
    v40[0] = v59
    v101[0] = v23
    v40[0] = v30
    v15[0] = v14
    v15[0] = v30
    v20 = v192
    let v224: Double = v101[0]
    return v224
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]], p1: [[s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])]])], [s1(p0: [[s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])], [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]], p1: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])]])], [s1(p0: [[s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])]], p1: [[s0(p0: [[32.0], [33.0]], p1: [[34.0], [35.0]])]])]]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
