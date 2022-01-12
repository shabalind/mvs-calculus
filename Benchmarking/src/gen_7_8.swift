  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: s0 = v0.p0
    let v3: [[Double]] = v4.p1
    let v11: [[Double]] = v4.p0
    var v10: [[Double]] = v3
    let v22: [Double] = v10[0]
    var v27: [[Double]] = v10
    let v18: [Double] = v11[0]
    let v14: [Double] = v10[0]
    let v36: [Double] = v27[0]
    let v28: [Double] = v10[0]
    let v40: Double = v14[0]
    v10[0] = v28
    v10[0] = v22
    let v42: Double = v1 * v40
    let v55: Double = v36[0]
    v27[0] = v18
    let v99: Double = v42 - v42
    let v88: Double = v99 + v55
    return v88
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])])
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
