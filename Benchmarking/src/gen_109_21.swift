  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: [s0], _ v4: Double) -> Double {
    let v6: [[Double]] = v2.p1
    let v5: s0 = v3[1]
    let v16: [[Double]] = v5.p0
    let v13: [Double] = v6[0]
    let v17: [Double] = v16[1]
    let v20: Double = v13[0]
    let v32: Double = v17[0]
    let v43: Double = v20 / v32
    let v24: Double = v43 / v43
    let v59: Double = v17[0]
    let v48: Double = v24 + v59
    return v48
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: s0 = s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])
    let v2: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])
    let v3: [s0] = [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]
    let v4: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
