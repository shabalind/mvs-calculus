  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
    var p2: [s0]
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v4: [s2] = v0[0]
    let v7: s2 = v4[0]
    let v13: s0 = v7.p0
    let v35: [[Double]] = v13.p0
    let v30: [Double] = v35[0]
    let v32: Double = v1 - v1
    var v29: [Double] = v30
    v29[0] = v32
    let v47: Double = v29[0]
    var v55: Double = v47
    return v55
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p2: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])]]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
