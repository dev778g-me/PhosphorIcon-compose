package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PaperclipHorizontalDuotone: ImageVector
    get() {
        if (_PaperclipHorizontalDuotone != null) {
            return _PaperclipHorizontalDuotone!!
        }
        _PaperclipHorizontalDuotone = ImageVector.Builder(
            name = "Duotone.PaperclipHorizontalDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(192f, 80f)
                horizontalLineTo(80f)
                verticalLineToRelative(32f)
                horizontalLineTo(48f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 64f)
                horizontalLineTo(192f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 144f)
                horizontalLineTo(192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                horizontalLineTo(48f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 64f)
                horizontalLineTo(192f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -96f)
                horizontalLineTo(80f)
            }
        }.build()

        return _PaperclipHorizontalDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipHorizontalDuotone: ImageVector? = null
