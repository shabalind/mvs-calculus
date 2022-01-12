  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [[s1]]
    var p1: s0
  }
  func f29(_ v0: s3) -> s3 {
    var v8: s3 = v0
    return v8
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v4: s3 = f29(v0)
    let v2: Double = v1 / v1
    let v11: s0 = v4.p1
    let v23: [[Double]] = v11.p0
    var v21: Double = v2
    let v46: [Double] = v23[0]
    var v95: [Double] = v46
    v95[0] = v1
    let v131: Double = v95[0]
    v95[0] = v21
    let v171: Double = v21 * v131
    return v171
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])])]], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
