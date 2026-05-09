package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BookmarkDuotone: ImageVector
    get() {
        if (_BookmarkDuotone != null) {
            return _BookmarkDuotone!!
        }
        _BookmarkDuotone = ImageVector.Builder(
            name = "Duotone.BookmarkDuotone",
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
                moveTo(192f, 176f)
                lineToRelative(-64.01f, -40f)
                lineToRelative(-63.99f, 40f)
                lineToRelative(0f, 48f)
                lineToRelative(63.99f, -40f)
                lineToRelative(64.01f, 40f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 224f)
                lineToRelative(-64f, -40f)
                lineTo(64f, 224f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 176f)
                lineToRelative(-64.01f, -40f)
                lineToRelative(-63.99f, 40f)
            }
        }.build()

        return _BookmarkDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkDuotone: ImageVector? = null
