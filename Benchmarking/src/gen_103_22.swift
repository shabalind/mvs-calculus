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
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v4: [s1] = v0
    var v5: [s1] = v0
    let v11: s1 = v5[1]
    let v13: s0 = v11.p1
    let v12: [[Double]] = v13.p0
    let v16: s1 = v0[0]
    let v31: [Double] = v12[0]
    var v33: [Double] = v31
    v5[1] = v16
    let v83: Double = v33[0]
    v5 = v4
    return v83
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]])), s1(p0: [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])], p1: s0(p0: [[10.0]], p1: [[11.0]]))]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
