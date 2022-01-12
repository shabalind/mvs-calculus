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
    var p0: [s1]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[1]
    var v8: s2 = v7
    let v3: s1 = v8.p1
    let v5: s2 = v0[0]
    v8.p1 = v3
    let v21: [s1] = v5.p0
    let v24: s0 = v3.p1
    v8.p0 = v21
    let v19: [[Double]] = v24.p0
    let v50: [Double] = v19[0]
    v8.p0 = v21
    var v35: [Double] = v50
    let v79: Double = v35[0]
    return v79
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))], p1: s1(p0: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))), s2(p0: [s1(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))], p1: s1(p0: [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])], p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])))]
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
