  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: s1 = v0[0]
    let v2: s1 = v0[0]
    let v5: s1 = v0[0]
    let v4: [s0] = v2.p1
    var v6: s1 = v7
    let v10: [s0] = v7.p0
    let v9: [s0] = v7.p0
    var v8: s1 = v6
    v6.p0 = v9
    v8.p1 = v4
    let v18: [s0] = v8.p1
    v6.p0 = v9
    v8 = v5
    var v17: [s0] = v18
    let v14: s0 = v18[0]
    v17[0] = v14
    let v11: [s0] = v7.p0
    let v24: s1 = v0[0]
    let v28: s0 = v9[2]
    v8.p0 = v10
    let v16: [s0] = v24.p0
    v6.p1 = v4
    let v22: s1 = s1(p0: v11, p1: v18)
    v6.p0 = v16
    let v42: [[Double]] = v14.p1
    let v38: [Double] = v42[0]
    let v48: [s0] = v22.p0
    let v47: s0 = v16[0]
    v6.p1 = v17
    v8.p0 = v48
    var v37: [s0] = v18
    v8.p1 = v37
    v17[0] = v28
    let v27: Double = v38[0]
    v6.p0 = v48
    v6.p0 = v48
    v37[0] = v47
    return v27
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])]), s1(p0: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]])], p1: [s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])])]
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
