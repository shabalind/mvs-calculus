  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [Double], _ v3: Double) -> Double {
    var v6: [Double] = v2
    v6[0] = v3
    v6[1] = v3
    let v5: Double = v2[1]
    v6[0] = v3
    var v7: [Double] = v6
    let v13: [Double] = v1[2]
    v7[0] = v3
    let v4: Double = v5 / v5
    v6[0] = v4
    let v14: [Double] = v0[0]
    var v39: [Double] = v13
    let v21: Double = v39[0]
    var v26: Double = v3
    var v19: Double = v21
    let v33: Double = v2[0]
    v39[0] = v26
    var v24: Double = v33
    v39[0] = v5
    var v44: [Double] = v39
    v7[0] = v19
    var v31: [Double] = v2
    let v59: Double = v2[1]
    v44 = v39
    v39[0] = v24
    var v42: Double = v59
    let v77: Double = v21 / v21
    var v65: [Double] = v7
    let v100: [[Double]] = [v65, v31, v7, v6, v7, v7]
    let v120: [Double] = v100[5]
    v44[0] = v5
    let v78: Double = v120[0]
    v65[2] = v77
    v7[0] = v24
    var v119: [Double] = v2
    let v143: Double = v119[2]
    let v79: Double = v14[0]
    v119[0] = v79
    let v103: Double = v44[0]
    v31[2] = v143
    var v301: [Double] = v7
    v44[0] = v26
    v65[2] = v103
    v7 = v301
    var v177: Double = v78
    v301[2] = v42
    return v177
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0], [3.0]]
    let v2: [Double] = [4.0, 5.0, 6.0]
    let v3: Double = 7.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 7.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
