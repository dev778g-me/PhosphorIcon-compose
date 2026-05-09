package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Biohazard: ImageVector
    get() {
        if (_Biohazard != null) {
            return _Biohazard!!
        }
        _Biohazard = ImageVector.Builder(
            name = "Regular.Biohazard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 132f)
                moveToRelative(-56f, 0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 207.83f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 164f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 164f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 43.83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 27.79f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
        }.build()

        return _Biohazard!!
    }

@Suppress("ObjectPropertyName")
private var _Biohazard: ImageVector? = null
