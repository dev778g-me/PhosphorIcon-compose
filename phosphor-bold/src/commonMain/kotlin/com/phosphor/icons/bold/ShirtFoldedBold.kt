package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ShirtFoldedBold: ImageVector
    get() {
        if (_ShirtFoldedBold != null) {
            return _ShirtFoldedBold!!
        }
        _ShirtFoldedBold = ImageVector.Builder(
            name = "Bold.ShirtFoldedBold",
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
                moveTo(128f, 80f)
                lineTo(97.66f, 109.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 104f)
                verticalLineTo(48f)
                lineToRelative(16f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 80f)
                lineTo(128f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172f, 48f)
                horizontalLineToRelative(28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(100f, 32f)
                lineTo(156f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 32f)
                lineToRelative(16f, 16f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(128f, 80f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(159.47f, 30f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156f, 28f)
                horizontalLineTo(100f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.46f, 6f)
                lineToRelative(28f, 48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.92f, 0f)
                lineToRelative(28f, -48f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 159.47f, 30f)
                close()
            }
        }.build()

        return _ShirtFoldedBold!!
    }

@Suppress("ObjectPropertyName")
private var _ShirtFoldedBold: ImageVector? = null
