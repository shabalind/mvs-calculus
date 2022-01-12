  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v7: Double = v1
    let v5: s0 = v0.p0
    let v2: [[Double]] = v5.p1
    let v9: [Double] = v2[0]
    let v3: Double = v9[0]
    v7 = v3
    var v14: Double = v3
    let v13: Double = v9[0]
    let v24: Double = v14 * v7
    let v101: Double = v13 * v24
    return v101
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0]]), p1: [[s0(p0: [[5.0]], p1: [[6.0], [7.0], [8.0]], p2: [[9.0]])], [s0(p0: [[10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0]])]])
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
