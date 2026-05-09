package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FlipVerticalBold: ImageVector
    get() {
        if (_FlipVerticalBold != null) {
            return _FlipVerticalBold!!
        }
        _FlipVerticalBold = ImageVector.Builder(
            name = "Bold.FlipVerticalBold",
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
                moveTo(59.12f, 32.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 40f)
                verticalLineToRelative(60f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(216f)
                curveToRelative(8.72f, 0f, 11.15f, -12f, 3.12f, -15.37f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(219.11f, 163.37f)
                curveToRelative(8f, -3.4f, 5.6f, -15.37f, -3.12f, -15.37f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(60f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.12f, 7.37f)
                close()
            }
        }.build()

        return _FlipVerticalBold!!
    }

@Suppress("ObjectPropertyName")
private var _FlipVerticalBold: ImageVector? = null
