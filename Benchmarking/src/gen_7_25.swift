  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f33(_ v0: Double) -> Double {
    let v1: Double = v0 / v0
    var v5: Double = v1
    var v4: Double = v1
    var v3: Double = v0
    v3 = v4
    var v10: Double = v1
    var v6: Double = v10
    v6 = v0
    var v8: Double = v5
    var v2: Double = v10
    var v7: Double = v2
    var v9: Double = v5
    var v11: Double = v0
    var v13: Double = v3
    var v18: Double = v13
    var v15: Double = v6
    var v25: Double = v18
    v3 = v9
    let v12: [Double] = [v3, v15, v3, v0, v9, v0, v10]
    let v31: [Double] = [v15, v11, v10]
    var v24: Double = v25
    var v30: [Double] = v31
    var v34: [Double] = v30
    var v41: [Double] = v12
    let v40: Double = v34[2]
    let v16: [[Double]] = [v12, v41, v41, v12]
    v41[2] = v40
    v34[2] = v18
    v10 = v7
    v30[1] = v10
    v7 = v9
    var v26: Double = v2
    v34[0] = v6
    v30[2] = v6
    let v48: Double = v34[1]
    v34[2] = v0
    let v33: Double = v31[1]
    v30[2] = v33
    var v67: [[Double]] = v16
    v41[0] = v8
    var v49: [[Double]] = v67
    var v57: [[Double]] = v49
    let v75: [Double] = v57[3]
    let v32: Double = v75[0]
    v34[1] = v24
    v15 = v26
    var v52: Double = v11
    v30[1] = v48
    v34[2] = v52
    var v62: Double = v32
    return v62
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s1, _ v2: Double) -> Double {
    let v7: Double = f33(v2)
    let v8: [s0] = v1.p0
    let v16: Double = v7 / v7
    let v18: s0 = v8[0]
    let v21: [[Double]] = v18.p0
    let v38: Double = f33(v2)
    var v35: Double = v38
    v35 = v16
    let v96: Double = f33(v7)
    var v50: Double = v16
    let v40: [Double] = v21[1]
    var v73: [Double] = v40
    v73[0] = v35
    v73[0] = v50
    v73[0] = v96
    let v161: Double = v73[0]
    return v161
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]))
    let v1: s1 = s1(p0: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
