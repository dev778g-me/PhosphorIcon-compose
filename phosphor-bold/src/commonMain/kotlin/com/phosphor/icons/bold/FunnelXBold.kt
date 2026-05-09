package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FunnelXBold: ImageVector
    get() {
        if (_FunnelXBold != null) {
            return _FunnelXBold!!
        }
        _FunnelXBold = ImageVector.Builder(
            name = "Bold.FunnelXBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(34.1f, 61.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.92f, 13.38f)
                lineTo(152f, 136f)
                verticalLineToRelative(58.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.56f, 6.66f)
                lineToRelative(-32f, 21.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                verticalLineTo(136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 168f)
                lineTo(240f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 168f)
                lineTo(192f, 216f)
            }
        }.build()

        return _FunnelXBold!!
    }

@Suppress("ObjectPropertyName")
private var _FunnelXBold: ImageVector? = null
