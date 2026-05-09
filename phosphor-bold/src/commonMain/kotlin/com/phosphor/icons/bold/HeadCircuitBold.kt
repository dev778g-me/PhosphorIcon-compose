package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.HeadCircuitBold: ImageVector
    get() {
        if (_HeadCircuitBold != null) {
            return _HeadCircuitBold!!
        }
        _HeadCircuitBold = ImageVector.Builder(
            name = "Bold.HeadCircuitBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(124f, 100f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 100f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 160f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 216f)
                horizontalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(171.81f)
                lineTo(36.42f, 159.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.77f, -10.3f)
                lineTo(56f, 104f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 64f)
                lineToRelative(8f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(214.38f, 88f)
                lineToRelative(-30.38f, 0f)
                lineToRelative(-40f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(124f, 76f)
                lineTo(124f, 24.89f)
            }
        }.build()

        return _HeadCircuitBold!!
    }

@Suppress("ObjectPropertyName")
private var _HeadCircuitBold: ImageVector? = null
