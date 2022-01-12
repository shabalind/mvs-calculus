  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s1, _ v2: Double) -> Double {
    let v7: s0 = v0[0]
    let v10: [[Double]] = v7.p0
    let v11: [Double] = v10[1]
    let v5: Double = v11[0]
    let v8: s0 = v1.p1
    let v16: [[Double]] = v8.p1
    let v27: Double = v5 * v5
    let v18: [Double] = v16[0]
    let v22: Double = v18[0]
    let v21: Double = v27 / v22
    let v45: Double = v5 / v21
    return v45
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]
    let v1: s1 = s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))
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
