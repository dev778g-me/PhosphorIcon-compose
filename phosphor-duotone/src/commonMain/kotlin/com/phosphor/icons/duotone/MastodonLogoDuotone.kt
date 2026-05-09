package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.MastodonLogoDuotone: ImageVector
    get() {
        if (_MastodonLogoDuotone != null) {
            return _MastodonLogoDuotone!!
        }
        _MastodonLogoDuotone = ImageVector.Builder(
            name = "Duotone.MastodonLogoDuotone",
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
                moveTo(40f, 72f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 40f)
                horizontalLineTo(184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                horizontalLineTo(40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 224f)
                horizontalLineTo(72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
                verticalLineTo(72f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 40f)
                horizontalLineTo(184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                horizontalLineTo(40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                verticalLineTo(104f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 0f)
                verticalLineToRelative(32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 136f)
                verticalLineTo(104f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 0f)
            }
        }.build()

        return _MastodonLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MastodonLogoDuotone: ImageVector? = null
