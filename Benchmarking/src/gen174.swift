  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f20(_ v0: [Double], _ v1: Double) -> Double {
    var v4: [Double] = v0
    var v3: [Double] = v4
    let v5: [[Double]] = [v3, v0, v3, v4]
    let v8: [Double] = v5[3]
    let v15: [[Double]] = [v3, v0, v4, v8, v4]
    let v17: Double = v0[0]
    v4[0] = v17
    var v41: [[Double]] = v15
    let v42: [Double] = v41[4]
    let v166: Double = v42[0]
    let v105: Double = v17 * v166
    v41[4] = v4
    return v105
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [[s0]], _ v2: Double) -> Double {
    var v12: [[s0]] = v1
    let v15: [s0] = v12[0]
    var v21: [s0] = v15
    let v24: s0 = v21[0]
    v21[0] = v24
    let v20: [[Double]] = v24.p0
    let v38: [Double] = v20[1]
    let v52: Double = f20(v38, v2)
    return v52
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: [[s0]] = [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]]
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
