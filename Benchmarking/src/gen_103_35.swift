  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  func f7(_ v0: s1, _ v1: s0) -> s1 {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [s0], _ v2: s1, _ v3: s1, _ v4: Double) -> Double {
    let v6: s0 = v2.p0
    let v7: Double = v4 + v4
    let v16: Double = v7 - v4
    let v14: Double = v16 + v16
    let v27: s1 = f7(v2, v6)
    let v20: s0 = v27.p0
    let v13: [[Double]] = v20.p0
    let v23: [Double] = v13[1]
    let v55: Double = v23[0]
    let v41: Double = v14 + v55
    let v135: Double = v41 * v41
    return v135
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]])), s1(p0: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]))]
    let v1: [s0] = [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])]
    let v2: s1 = s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))
    let v3: s1 = s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]))
    let v4: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
