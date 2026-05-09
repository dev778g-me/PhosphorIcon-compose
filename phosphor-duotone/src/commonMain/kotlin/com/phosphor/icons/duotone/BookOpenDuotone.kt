package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BookOpenDuotone: ImageVector
    get() {
        if (_BookOpenDuotone != null) {
            return _BookOpenDuotone!!
        }
        _BookOpenDuotone = ImageVector.Builder(
            name = "Duotone.BookOpenDuotone",
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
                moveTo(160f, 56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 56f)
                horizontalLineTo(24f)
                verticalLineTo(200f)
                horizontalLineTo(96f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(72f)
                verticalLineTo(56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 88f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(72f)
                verticalLineTo(200f)
                horizontalLineTo(160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 200f)
                horizontalLineTo(96f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineTo(88f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 56f)
                horizontalLineTo(24f)
                close()
            }
        }.build()

        return _BookOpenDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenDuotone: ImageVector? = null
