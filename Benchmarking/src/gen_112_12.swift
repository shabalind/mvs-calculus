  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
  }
  struct s3 {
    var p0: s1
    var p1: [[s2]]
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: s0, _ v2: Double) -> Double {
    let v7: [Double] = [v2, v2, v2, v2, v2]
    var v5: [Double] = v7
    let v9: Double = v7[2]
    var v11: Double = v2
    v5[1] = v9
    var v12: Double = v9
    v5[1] = v11
    let v18: Double = v5[2]
    v5[2] = v18
    v5[3] = v18
    v5[3] = v12
    v5[3] = v12
    v5[4] = v2
    let v46: Double = v5[0]
    let v41: Double = v9 * v11
    var v50: Double = v18
    v5[1] = v41
    v5[3] = v46
    v12 = v46
    return v50
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]), p1: [[s2(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]))]])]
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
