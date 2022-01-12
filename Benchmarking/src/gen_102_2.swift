  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  func f76(_ v0: Double) -> Double {
    let v5: Double = v0 - v0
    var v4: Double = v5
    let v7: [Double] = [v5, v0, v4, v0, v0]
    let v8: Double = v7[4]
    let v2: [Double] = [v5, v4, v8, v5, v5, v5, v5]
    let v15: Double = v2[2]
    var v26: Double = v15
    return v26
  }
  func f45(_ v0: Double) -> Double {
    var v2: Double = v0
    let v4: Double = f76(v2)
    let v8: Double = f76(v0)
    let v7: Double = f76(v8)
    let v10: [Double] = [v4, v2]
    let v13: Double = v10[0]
    let v24: Double = f76(v13)
    let v14: Double = f76(v24)
    let v30: Double = v10[1]
    var v22: [Double] = v10
    let v50: Double = f76(v13)
    let v40: Double = f76(v24)
    v22[1] = v7
    v22[1] = v8
    var v42: [Double] = v10
    let v31: Double = f76(v40)
    let v33: Double = v42[1]
    v42[0] = v50
    let v71: Double = v42[0]
    var v55: [Double] = v22
    v22[0] = v71
    v42[1] = v14
    let v60: Double = v55[1]
    v55[1] = v33
    v55[1] = v31
    v42[0] = v30
    v42[0] = v50
    return v60
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s0]], _ v2: Double) -> Double {
    let v4: Double = f45(v2)
    return v4
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s1(p0: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])))
    let v1: [[s0]] = [[s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])]]
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
