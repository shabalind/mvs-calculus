  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v6: [s3] = v0[1]
    var v5: [[s3]] = v0
    let v8: s3 = v6[0]
    let v2: [s3] = v5[1]
    v5[0] = v2
    let v14: [s3] = v5[0]
    var v10: [[s3]] = v5
    let v3: s3 = v14[0]
    v10[1] = v14
    let v12: [s0] = v3.p1
    let v18: [s3] = v0[1]
    v10[1] = v2
    v5 = v10
    v5[0] = v2
    let v30: s0 = v12[1]
    let v21: [[Double]] = v30.p1
    v10[1] = v2
    let v37: [Double] = v21[0]
    v10 = v0
    var v44: [Double] = v37
    v10[0] = v2
    v5[0] = v6
    v5[1] = v14
    v10 = v0
    let v43: Double = v44[0]
    var v118: Double = v43
    v5[0] = v18
    var v82: [s3] = v18
    var v110: [s3] = v82
    v110[0] = v8
    let v223: Double = v37[0]
    let v187: Double = v223 / v118
    v10[0] = v110
    return v187
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])])], [s3(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), p1: [s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]])])]]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
