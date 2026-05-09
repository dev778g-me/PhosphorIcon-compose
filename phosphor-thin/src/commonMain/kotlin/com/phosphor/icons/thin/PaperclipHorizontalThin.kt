package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.PaperclipHorizontalThin: ImageVector
    get() {
        if (_PaperclipHorizontalThin != null) {
            return _PaperclipHorizontalThin!!
        }
        _PaperclipHorizontalThin = ImageVector.Builder(
            name = "Thin.PaperclipHorizontalThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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

        return _PaperclipHorizontalThin!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipHorizontalThin: ImageVector? = null
