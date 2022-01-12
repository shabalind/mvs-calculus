  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: s0, _ v2: Double) -> Double {
    let v7: [s1] = v0[0]
    let v4: s1 = v7[0]
    let v12: [s0] = v4.p0
    let v20: s1 = s1(p0: v12, p1: v1)
    let v29: s0 = v20.p1
    let v16: [[Double]] = v29.p1
    let v19: [Double] = v16[2]
    let v71: [Double] = v16[0]
    let v75: [[Double]] = [v71, v19]
    let v82: [Double] = v75[0]
    let v105: Double = v82[0]
    return v105
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], p1: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]))], [s1(p0: [s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))], [s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])], p1: s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]]))]]
    let v1: s0 = s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]])
    let v2: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
