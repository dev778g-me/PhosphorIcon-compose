package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FolderStarBold: ImageVector
    get() {
        if (_FolderStarBold != null) {
            return _FolderStarBold!!
        }
        _FolderStarBold = ImageVector.Builder(
            name = "Bold.FolderStarBold",
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
                moveTo(98.39f, 46.69f)
                lineTo(128f, 80f)
                horizontalLineTo(32f)
                verticalLineTo(52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(92.41f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.39f, 46.69f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.56f, 208f)
                horizontalLineTo(39.38f)
                arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200.62f)
                verticalLineTo(80f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 198.54f)
                lineToRelative(29.67f, 17.46f)
                lineToRelative(-8.07f, -32.59f)
                lineToRelative(26.4f, -21.8f)
                lineToRelative(-34.65f, -2.67f)
                lineToRelative(-13.35f, -30.94f)
                lineToRelative(-13.35f, 30.94f)
                lineToRelative(-34.65f, 2.67f)
                lineToRelative(26.4f, 21.8f)
                lineToRelative(-8.07f, 32.59f)
                lineToRelative(29.67f, -17.46f)
                close()
            }
        }.build()

        return _FolderStarBold!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStarBold: ImageVector? = null
