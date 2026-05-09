package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FolderDashedBold: ImageVector
    get() {
        if (_FolderDashedBold != null) {
            return _FolderDashedBold!!
        }
        _FolderDashedBold = ImageVector.Builder(
            name = "Bold.FolderDashedBold",
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
                moveTo(88f, 208f)
                horizontalLineTo(39.38f)
                arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200.62f)
                verticalLineTo(192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 208f)
                lineTo(128f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 152f)
                verticalLineToRelative(48.89f)
                arcToRelative(7.11f, 7.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.11f, 7.11f)
                horizontalLineTo(200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 80f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 120f)
                lineTo(32f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(98.39f, 46.69f)
                lineTo(128f, 80f)
                horizontalLineTo(32f)
                verticalLineTo(52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(92.41f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.39f, 46.69f)
                close()
            }
        }.build()

        return _FolderDashedBold!!
    }

@Suppress("ObjectPropertyName")
private var _FolderDashedBold: ImageVector? = null
