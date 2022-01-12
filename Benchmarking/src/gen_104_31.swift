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
    var p0: [s1]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: [Double] = [v1, v1, v1, v1]
    let v7: [Double] = [v1, v1, v1, v1, v1, v1, v1]
    let v3: Double = v5[1]
    let v2: Double = v7[2]
    let v13: Double = v7[0]
    let v15: Double = v2 * v13
    let v25: Double = v5[2]
    let v38: Double = v5[0]
    let v35: Double = v15 / v25
    let v43: Double = v35 * v3
    let v181: Double = v43 * v38
    return v181
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]))]), p1: s2(p0: [s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))]))
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
