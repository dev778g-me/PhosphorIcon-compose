package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FolderOpenLight: ImageVector
    get() {
        if (_FolderOpenLight != null) {
            return _FolderOpenLight!!
        }
        _FolderOpenLight = ImageVector.Builder(
            name = "Light.FolderOpenLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 208f)
                verticalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(93.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 1.6f)
                lineTo(128f, 80f)
                horizontalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 208f)
                lineToRelative(30.18f, -90.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.77f, 112f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.59f, 10.53f)
                lineTo(211.09f, 208f)
                close()
            }
        }.build()

        return _FolderOpenLight!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpenLight: ImageVector? = null
