  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: Double) -> Double {
    let v7: s0 = v0[0]
    var v6: Double = v2
    let v14: [[Double]] = v7.p0
    let v11: [Double] = v14[1]
    var v29: Double = v2
    let v26: Double = v11[0]
    let v47: [Double] = v14[0]
    var v61: [Double] = v47
    v61[0] = v29
    v61[0] = v6
    v29 = v26
    v61[0] = v6
    let v88: Double = v61[0]
    return v88
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])]
    let v1: s0 = s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])
    let v2: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
