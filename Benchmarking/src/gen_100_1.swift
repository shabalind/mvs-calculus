  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: Double
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v5: [s3] = v0[0]
    let v4: s3 = v5[0]
    let v3: [s3] = v0[0]
    var v6: s3 = v4
    let v8: s3 = v3[0]
    let v7: s3 = v3[0]
    let v10: s2 = v8.p0
    v6.p1 = v1
    v6.p0 = v10
    v6 = v7
    let v23: s3 = v3[0]
    let v17: Double = v1 * v1
    v6 = v23
    var v32: s3 = v6
    v6.p0 = v10
    var v30: Double = v1
    v32.p0 = v10
    v6.p0 = v10
    v6.p1 = v1
    v30 = v17
    let v41: Double = v32.p1
    let v87: Double = v30 * v41
    return v87
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), p1: [s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])), s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))]), p1: 18.0)]]
    let v1: Double = 19.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 19.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
